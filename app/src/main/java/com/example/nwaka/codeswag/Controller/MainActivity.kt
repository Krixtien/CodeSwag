package com.example.nwaka.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.nwaka.codeswag.Adapters.CategoryAdapter
import com.example.nwaka.codeswag.Model.Category
import com.example.nwaka.codeswag.R
import com.example.nwaka.codeswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
        
        categoryListView.setOnItemClickListener {adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "you clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }

    }
}
