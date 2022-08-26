package com.marannix.filterfood

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

/**
 * All -- Categories -- Cuisine -- Time
 */
class ExploreFilterItem(
    filter: ExploreFilter,
    context: Context,
    listener: ClickListener? = null,
    attrs: AttributeSet? = null,
) :
    ConstraintLayout(context, attrs) {

    interface ClickListener {
        fun onClick(filter: ExploreFilter)
    }

    private var exploreFilterNameTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.container_items, this, true)
        exploreFilterNameTextView = findViewById(R.id.exploreFilterName)
        exploreFilterNameTextView.text = filter.name
        exploreFilterNameTextView.setOnClickListener {
            listener?.onClick(filter)
        }
    }
}
