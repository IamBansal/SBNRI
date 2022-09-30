package com.example.sbnri.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.sbnri.R
import com.example.sbnri.adapter.ShortsAdapter
import com.example.sbnri.adapter.VideoAdapter
import com.example.sbnri.databinding.ActivityMainBinding
import com.example.sbnri.model.Shorts
import com.example.sbnri.model.Video

class MainActivity : AppCompatActivity() {

    private lateinit var shortsAdapter: ShortsAdapter
    private lateinit var videosAdapter: VideoAdapter
    private lateinit var shortsList: ArrayList<Shorts>
    private lateinit var videosList: ArrayList<Video>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addDummyContent()

        val recyclerViewShorts = binding.recyclerViewShorts
        val recyclerViewVideos = binding.recyclerViewVideos

        shortsAdapter = ShortsAdapter(shortsList)
        recyclerViewShorts.adapter = shortsAdapter
        recyclerViewShorts.layoutManager = StaggeredGridLayoutManager(1, LinearLayoutManager.HORIZONTAL)

        videosAdapter = VideoAdapter(videosList)
        recyclerViewVideos.adapter = videosAdapter
        recyclerViewVideos.layoutManager = LinearLayoutManager(this)

    }

    private fun addDummyContent() {

        shortsList = arrayListOf(
            Shorts(R.drawable.pic, "This is first photo"),
            Shorts(R.drawable.four, "This is second photo"),
            Shorts(R.drawable.pic, "This is third photo"),
            Shorts(R.drawable.four, "This is fourth photo"),
            Shorts(R.drawable.pic, "This is shiva and krishna"),
            Shorts(R.drawable.pic, "This is shiva and krishna"),
            Shorts(R.drawable.pic, "This is shiva and krishna"),
            Shorts(R.drawable.pic, "This is shiva and krishna")
        )

        videosList = arrayListOf(
            Video(R.drawable.one),
            Video(R.drawable.two),
            Video(R.drawable.three),
            Video(R.drawable.four),
            Video(R.drawable.pic),
            Video(R.drawable.one),
            Video(R.drawable.two),
            Video(R.drawable.three),
            Video(R.drawable.four),
            Video(R.drawable.pic),
        )

    }
}