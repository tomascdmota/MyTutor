package com.example.mytutor.Model

import android.os.Bundle
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mytutor.Adapter.CategoryAdapter
import com.example.mytutor.Common.SpacesItemDecoration
import com.example.mytutor.DBHelper.DBHelper
import com.example.mytutor.R
import kotlinx.android.synthetic.main.activity_category.*

class Category(var id:Int, var name:String?, var image:String?)

