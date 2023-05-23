package com.rahul.recyclerviewsubmodule

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rahul.core.recyclerview.CustomRecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var customRecyclerView: CustomRecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customRecyclerView = findViewById(R.id.rv_custom_recycler)

        val data  = mutableListOf<String>()
        for (i in 1..25){
            data.add("Item $i")
        }

        customRecyclerView.setData(data)
    }
}