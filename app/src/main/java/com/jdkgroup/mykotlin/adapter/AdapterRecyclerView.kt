package com.jdkgroup.mykotlin

import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import com.jdkgroup.mykotlin.model.ModelUser
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AdapterRecyclerView(val userList: ArrayList<ModelUser>) : RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterRecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itemview_recyclerview, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdapterRecyclerView.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: ModelUser) {
            val textViewName = itemView.findViewById<View>(R.id.textViewUsername) as AppCompatTextView
            val textViewAddress  =  itemView.findViewById<View>(R.id.textViewAddress) as AppCompatTextView
            textViewName.text = user.name
            textViewAddress.text = user.address
        }
    }
}