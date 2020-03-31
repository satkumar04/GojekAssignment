package com.example.assignment.viewmodel
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.emedinaa.kotlinmvvm.capture
import com.example.assignment.model.database.entity.User
import com.example.assignment.repository.AppRepository
import com.example.assignment.repository.OperationCallBack
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.*

class ViewModelTest {
    @get:Rule
    val rule = InstantTaskExecutorRule()
    @Mock
    private lateinit var repository: AppRepository
    @Captor
    private lateinit var operationCallbackCaptor: ArgumentCaptor<OperationCallBack>
    private lateinit var observer: Observer<MutableList<User>>
    private lateinit var viewModel: AppViewModel
    private lateinit var repoList: MutableList<User>
    private lateinit var repoEmptyList: MutableList<User>


    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)

        mockData()
        setupObservers()
        viewModel = AppViewModel(repository)

    }


    @Test
    fun repoListRepositoryAndViewModel() {
        with(viewModel) {

            fetchRepo()
            repoListLiveData.observeForever(observer)
        }

        Mockito.verify(repository, Mockito.times(2)).getRepo(capture(operationCallbackCaptor))
        operationCallbackCaptor.value.onSuccess(repoList)

        Assert.assertNotNull(viewModel.repoListLiveData.value)
        Assert.assertTrue(viewModel.repoListLiveData.value?.size == 1)
    }

    @Test
    fun repoEmptyListRepositoryAndViewModel() {
        with(viewModel) {
            fetchRepo()
            repoListLiveData.observeForever(observer)
        }

        Mockito.verify(repository, Mockito.times(2)).getRepo(capture(operationCallbackCaptor))
        operationCallbackCaptor.value.onSuccess(repoEmptyList)
        Assert.assertNotNull(viewModel.repoListLiveData.value)
        Assert.assertTrue(viewModel.repoListLiveData.value?.size == 0)
    }

    private fun setupObservers() {

        observer = Mockito.mock(Observer::class.java) as Observer<MutableList<User>>
    }

    private fun mockData() {
        repoEmptyList = arrayListOf()
        val mockList: MutableList<User> = mutableListOf()
        mockList.add(
            User(
                1,
                "Alpha",
                "Beta",
                "Type",
                "url",
                "avatar",
                 "Java",
                "#F18E33",
                75,
                226,
                45
            )
        )
        repoList = mockList
    }
}