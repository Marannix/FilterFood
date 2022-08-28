package com.marannix.filterfood

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ExploreFilterItem.ClickListener {

    private lateinit var linearLayout: LinearLayout
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ExploreAdapter
    private val listOfRecipes = ExploreRecipe.get()
    private val listOfFilter =
        listOf(ExploreFilter.ALL, ExploreFilter.CATEGORY, ExploreFilter.CUISINE, ExploreFilter.TIME)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayout = findViewById(R.id.exploreContainer)
        recyclerView = findViewById(R.id.exploreRecyclerView)
        createExploreItem()
        setAdapter()
    }

    private fun setAdapter() {
        adapter = ExploreAdapter(listOfRecipes)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
        adapter.sortBy(ExploreFilter.ALL)
    }

    private fun createExploreItem() {
        listOfFilter.forEach {
            val container = ExploreFilterItem(it, this, this)
            linearLayout.addView(container)
        }
    }

    override fun onClick(filter: ExploreFilter) {
        adapter.sortBy(filter)
    }
}
