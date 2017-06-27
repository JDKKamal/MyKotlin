package com.jdkgroup.mykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.jdkgroup.mykotlin.R
import pro.siper.adapterx.AdapterX

class ActivityAdapterX : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter_x)
        var recyclerView: RecyclerView = findViewById(R.id.list) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        var adapter: AdapterX = AdapterX()
        recyclerView.adapter = adapter
        adapter.addItem(Item1(this))
        adapter.addItem(Item2(this))
        adapter.addItem(Item1(this))
        adapter.addItem(Item2(this))
        adapter.addItem(Item1(this))
        adapter.addItem(Item2(this))
        adapter.addItem(Item1(this))
        adapter.addItem(Item2(this))
        adapter.addItem(Item1(this))
        adapter.addItem(Item2(this))
        adapter.addItem(Item1(this))
        adapter.addItem(Item2(this))
        adapter.addItem(Item1(this))
        adapter.addItem(Item2(this))
        adapter.notifyDataSetChanged()
    }
}
