package com.example.sbnri.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sbnri.databinding.CustomShortsItemBinding
import com.example.sbnri.model.Shorts

class ShortsAdapter(private var shortsList : ArrayList<Shorts>): RecyclerView.Adapter<ShortsAdapter.ViewHolder>() {

    class ViewHolder(view : CustomShortsItemBinding) : RecyclerView.ViewHolder(view.root) {
        val image = view.imageView
        val text = view.text
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CustomShortsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val shorts = shortsList[position]
        holder.image.setImageResource(shorts.image)
        holder.text.text = shorts.text
    }

    override fun getItemCount(): Int {
        return shortsList.size
    }


}