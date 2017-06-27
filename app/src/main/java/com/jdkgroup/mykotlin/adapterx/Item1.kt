package com.jdkgroup.mykotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import android.widget.Toast
import pro.siper.adapterx.BaseItem
import pro.siper.adapterx.ItemX
import pro.siper.adapterx.ViewHolderX

class Item1(context: Context) : ItemX<ViewHolder1>() {
    val context: Context
    init {
        this.context = context
    }
    override fun onClick(item: BaseItem, position: Int) {
        Toast.makeText(context, "Item 1 clicked at position: $position", Toast.LENGTH_SHORT).show()
    }

    override fun onLongClick(item: BaseItem, position: Int) {
        Toast.makeText(context, "Item 1 long clicked at position: $position", Toast.LENGTH_SHORT).show()
    }

    override fun getLayout(): Int = R.layout.itemview_adapter1_x

    override fun bindView(holder: ViewHolder1) {
        holder.title!!.text = "Item 1 at position: ${holder.adapterPosition}"
    }

    override fun createView(parent: View): RecyclerView.ViewHolder = ViewHolder1(parent, this)
}

class ViewHolder1(itemView: View?, item: Item1): ViewHolderX(itemView, item) {
    val title: TextView?
    init {
        title = itemView!!.findViewById<View>(R.id.title) as TextView
    }
}