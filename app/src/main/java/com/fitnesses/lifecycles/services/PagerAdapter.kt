package com.fitnesses.lifecycles.services

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fitnesses.lifecycles.R
import com.google.android.material.textview.MaterialTextView

class PagerAdapter (val list:ArrayList<String>)  : RecyclerView.Adapter<PagerAdapter.PagerViewHolder>() {



    inner class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tv:MaterialTextView=itemView.findViewById(R.id.TV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
     return PagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
     val data=list[position]
        holder.apply {
            tv.text=data
        }
    }

    override fun getItemCount(): Int {
     return   list.size
    }
}