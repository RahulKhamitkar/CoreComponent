package com.rahul.core.recyclerview

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerView(context: Context, attrs: AttributeSet) : RecyclerView(context, attrs) {

    init {
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        layoutManager = LinearLayoutManager(context)
    }

    fun setData(data: List<String>) {
        val adapter = MyAdapter(data)
        this.adapter = adapter
    }
}