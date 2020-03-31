package com.example.assignment.ui

import androidx.databinding.ViewDataBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.assignment.databinding.RepoItemRowBinding
import com.example.assignment.model.database.entity.User
import com.example.assignment.ui.base.DataBindingViewHolder
import com.example.assignment.BR.item
import com.example.assignment.util.ExpandableLayout
import com.example.assignment.util.ItemClickCallBack
import java.util.HashSet

class RepoAdapter(
    // Save the expanded row position
    private var items: MutableList<User> = arrayListOf()
) : androidx.recyclerview.widget.RecyclerView.Adapter<RepoAdapter.SimpleRepoHolder>(),
    ItemClickCallBack {
    private val expandedPositionSet: HashSet<Int> = HashSet()
    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: SimpleRepoHolder, position: Int) {
        holder.onBind(items[position])

        (holder.dataBinding as RepoItemRowBinding).expandLayout.setOnExpandListener(object :
            ExpandableLayout.OnExpandListener {
            override fun onExpand(expanded: Boolean) {
                if (expandedPositionSet.contains(position)) {
                    expandedPositionSet.remove(position)
                } else {
                    for (value in expandedPositionSet) {
                        if (position != value) {
                            notifyItemChanged(value)
                            expandedPositionSet.remove(value)
                        }
                    }
                    expandedPositionSet.add(position)
                }
            }

        })


        holder.dataBinding.expandLayout.setExpand(expandedPositionSet.contains(position))

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleRepoHolder {
        val binding = RepoItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return SimpleRepoHolder(binding)
    }

    inner class SimpleRepoHolder(dataBinding: ViewDataBinding) :
        DataBindingViewHolder<User>(dataBinding) {
        override fun onBind(t: User): Unit = with(t) {
            dataBinding.setVariable(item, t)
        }
    }

    fun add(list: MutableList<User>) {
        items.addAll(list)
        notifyDataSetChanged()
    }

    fun clear() {
        items.clear()
        notifyDataSetChanged()
    }

    override fun <T> getItem(item: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
