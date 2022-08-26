package com.marannix.filterfood

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.marannix.filterfood.ExploreAdapter.ExploreViewHolder

class ExploreAdapter : RecyclerView.Adapter<ExploreViewHolder>() {

    private val items: MutableList<ExploreRecipe> = mutableListOf()

    fun setData(listOfExploreRecipe: List<ExploreRecipe>, filter: ExploreFilter) {
        items.clear()

        when (filter) {
            ExploreFilter.ALL -> {
                items.addAll(listOfExploreRecipe)
            }
            ExploreFilter.CATEGORY -> {
                items.addAll(listOfExploreRecipe.sortedBy { it.category })
            }
            ExploreFilter.CUISINE -> {
                items.addAll(listOfExploreRecipe.sortedBy { it.cuisine })
            }
            ExploreFilter.TIME -> {
                items.addAll(listOfExploreRecipe.sortedBy { it.time })
            }
        }

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {
        return ExploreViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.explore_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ExploreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(exploreRecipe: ExploreRecipe) {
            val recipeName = itemView.findViewById<TextView>(R.id.recipeName)
            recipeName.text = exploreRecipe.name
        }
    }
}
