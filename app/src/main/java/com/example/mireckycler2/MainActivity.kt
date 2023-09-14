package com.example.mireckycler2

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mireckycler2.adapter.RecyclerViewAdapter
import com.example.mireckycler2.data.DataSource
import com.example.mireckycler2.model.RecyclerData

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    private lateinit var dataSource : DataSource
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.idCourseRV)
        //Gridlaoyout con 2 columnas
         val layoutManager = GridLayoutManager(this, 2)
        //LinearLayout Manager para hacer el recycler Hortizontal
        //val layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = RecyclerViewAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }
   

}