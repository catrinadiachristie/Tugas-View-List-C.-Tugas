package com.uty.listviewpresiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uty.listviewpresiden.Model.DataPresiden
import com.uty.listviewpresiden.Model.Presiden
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvPresiden: RecyclerView

    private var list: ArrayList<Presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresiden = findViewById(R.id.rv_presiden)
        rvPresiden.setHasFixedSize(true)
        list.addAll(DataPresiden.urutanpresiden)
        showPresidenList()
    }

    private fun showPresidenList() {
        rvPresiden.layoutManager = LinearLayoutManager(this )
        val presidenAdapter = ListPresidenAdapter(list)
        rvPresiden.adapter = presidenAdapter
}
