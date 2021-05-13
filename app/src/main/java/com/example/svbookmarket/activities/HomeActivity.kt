package com.example.svbookmarket.activities

import android.graphics.drawable.ClipDrawable.HORIZONTAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.HORIZONTAL
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.*
import com.example.svbookmarket.R
import com.example.svbookmarket.activities.adapter.AdvertiseAdapter
import com.example.svbookmarket.activities.adapter.CategoryAdapter
import com.example.svbookmarket.activities.adapter.FeaturedAdapter
import com.example.svbookmarket.activities.data.DataSource
import com.example.svbookmarket.databinding.ActivityCategoryBinding
import com.google.android.material.appbar.AppBarLayout

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        binding = ActivityCategoryBinding.inflate(layoutInflater)



//        Load data
        val dataBookSet = DataSource().loadBookFeature()


        //set up book feature catalog
        val recyclerFeature: RecyclerView = findViewById(R.id.booksFeatured)
        recyclerFeature.adapter = FeaturedAdapter(dataBookSet)
        val featureLayoutManager: LinearLayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerFeature.layoutManager = featureLayoutManager


        //set up all book catalog
        val recyclerAllBook: RecyclerView = findViewById(R.id.bookCatalog)
        recyclerAllBook.adapter = FeaturedAdapter(dataBookSet)
        val allBookCatalogLayoutManager: GridLayoutManager = GridLayoutManager(this, 2)
        recyclerAllBook.layoutManager = allBookCatalogLayoutManager


        //set up adapter to category
        val dataCategorySet = DataSource().loadCategory()
        val recyclerCategory: RecyclerView = findViewById(R.id.bookCategory)
        recyclerCategory.adapter = CategoryAdapter(dataCategorySet)
        val categoryLayoutManager: LinearLayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerCategory.layoutManager = categoryLayoutManager

        //set up adapter to advertise
        val dataAdvertiseSet =  DataSource().loadAdvertise()
        val recyclerAdvertise: RecyclerView = findViewById(R.id.advertise)
        recyclerAdvertise.adapter = AdvertiseAdapter(dataAdvertiseSet)
        val advertiseLayoutManagemer: LinearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerAdvertise.layoutManager = advertiseLayoutManagemer
        val snapHelper: LinearSnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerAdvertise)
    }
}