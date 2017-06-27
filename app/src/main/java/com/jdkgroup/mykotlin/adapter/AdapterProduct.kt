package com.jdkgroup.mykotlin.adapter

import android.app.Activity
import android.support.v7.widget.AppCompatImageView
import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar

import com.jdkgroup.mykotlin.R
import com.jdkgroup.mykotlin.model.ModelUser

class AdapterProduct(private val activity: Activity, private val alCompany: List<ModelUser>?) : RecyclerView.Adapter<AdapterProduct.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemLayoutView = LayoutInflater.from(parent.context).inflate(R.layout.itemview_recyclerview, null)
        val viewHolder = ViewHolder(itemLayoutView)

        return viewHolder
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val (name) = alCompany!![position]
        viewHolder.apptvProductName.text = name
    }

    override fun getItemCount(): Int {
        return alCompany?.size ?: 0
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val apptvProductName: AppCompatTextView

        init {
            apptvProductName = itemView.findViewById<View>(R.id.textViewUsername) as AppCompatTextView
        }
    }

}

