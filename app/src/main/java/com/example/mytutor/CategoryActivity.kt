package com.example.mytutor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mytutor.Adapter.CategoryAdapter
import com.example.mytutor.Common.SpacesItemDecoration
import com.example.mytutor.DBHelper.DBHelper
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        toolbar.title = "My Tutor"
        setSupportActionBar(toolbar)

        recycler_category.setHasFixedSize(true)
        recycler_category.layoutManager = GridLayoutManager(this, 2)


        val adapter = CategoryAdapter(this, DBHelper.getInstance(this).allCategories)
        recycler_category.addItemDecoration(SpacesItemDecoration(4))
        recycler_category.adapter = adapter


    }

}