package com.example.viewpejer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpejer.adapter.MyImageAdapter
import com.example.viewpejer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MyImageAdapter
    lateinit var list: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadImg()

        adapter = MyImageAdapter(list)
        binding.viewPeger2.adapter = adapter

    }

    private fun loadImg() {
        list = ArrayList()
        list.add("https://storage.kun.uz/source/9/hFBbFmn0Qg5gXALQ4uT7LwwiUDqR8v9r.jpg")
        list.add("https://storage.kun.uz/source/9/rvDCUFoRpLEzeF7bTt1gf3xqmRSnuL9N.jpg")
        list.add("https://storage.kun.uz/source/9/srL93Rxs8G5KaHX7EjsRs3NYsyQmKvL6.jpg")
    }
}