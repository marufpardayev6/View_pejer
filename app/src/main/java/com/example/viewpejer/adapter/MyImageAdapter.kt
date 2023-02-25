package com.example.viewpejer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpejer.R
import com.example.viewpejer.databinding.IitemImageBinding
import com.squareup.picasso.Picasso

class MyImageAdapter(var list: ArrayList<String>) :
    RecyclerView.Adapter<MyImageAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(img: String) {
            val bind = IitemImageBinding.bind(itemView)
            Picasso.get().load(img).into(bind.iv)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.iitem_image, parent, false)
        )
    }
    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position])
    }


}