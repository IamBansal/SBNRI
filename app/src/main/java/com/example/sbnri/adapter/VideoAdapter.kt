package com.example.sbnri.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sbnri.databinding.CustomVideoItemBinding
import com.example.sbnri.model.Video

class VideoAdapter(private var videoList : ArrayList<Video>): RecyclerView.Adapter<VideoAdapter.ViewHolder>() {

    class ViewHolder(view : CustomVideoItemBinding) :RecyclerView.ViewHolder(view.root) {
        val image = view.ivVideo
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CustomVideoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val video = videoList[position]
        holder.image.setImageResource(video.image)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }


}