package com.example.assignment.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.test.espresso.IdlingResource
import com.example.assignment.R
import com.example.assignment.model.database.entity.User
import com.example.assignment.util.EspressoIdlingResource
import com.example.assignment.viewmodel.AppViewModel
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.error_state.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: AppViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(AppViewModel::class.java)
    }
    val adapter: RepoAdapter by lazy {
        RepoAdapter(
            arrayListOf()
        )
    }
    val countingIdlingResource: IdlingResource
        @VisibleForTesting
        get() = EspressoIdlingResource.idlingResource


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.title = getString(R.string.app_name)
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white))
        with(viewModel) {
            repoListLiveData.observe(this@MainActivity, Observer {
                swipeContainer.isRefreshing = false
                retryLoader.visibility =View.GONE
               // progressBar_home.visibility =View.GONE //  not needed as we using Shimmer
                errorLayout.visibility=View.GONE
                rv_dataLayout.visibility = View.VISIBLE
                initView(it)
                shimmer_view_container.stopShimmerAnimation()
                shimmer_view_container.visibility=View.GONE
                EspressoIdlingResource.decrement()
            }
            )
            error.observe(this@MainActivity, Observer {
                retryLoader.visibility =View.GONE
                //progressBar_home.visibility =View.GONE   //  not needed as we using Shimmer
                errorLayout.visibility=View.VISIBLE
                rv_dataLayout.visibility = View.GONE
                shimmer_view_container.stopShimmerAnimation()
                shimmer_view_container.visibility=View.GONE
                EspressoIdlingResource.decrement()
            })
        }
        swipeContainer.setOnRefreshListener {

            viewModel.fetchRepo()
            EspressoIdlingResource.increment()

        }
     btnRetry.setOnClickListener {
         EspressoIdlingResource.increment()
         retryLoader.visibility =View.VISIBLE
         viewModel.fetchRepo()
     }
        EspressoIdlingResource.increment()
    }

    override fun onResume() {
        super.onResume()
        shimmer_view_container.startShimmerAnimation()
    }

    override fun onPause() {
        super.onPause()
        shimmer_view_container.stopShimmerAnimation()
    }

    private fun initView(it: MutableList<User>?) {
        rv_main_home.layoutManager =
            androidx.recyclerview.widget.LinearLayoutManager(
                this@MainActivity,
                androidx.recyclerview.widget.LinearLayoutManager.VERTICAL,
                false
            )
        rv_main_home.adapter = adapter
        if (it!!.isNotEmpty()) {

            adapter.clear()
            adapter.add(it)

        } else {
            Toast.makeText(
                this@MainActivity,
                this@MainActivity?.getString(R.string.empty_list),
                android.widget.Toast.LENGTH_LONG
            ).show()
        }

    }
}
