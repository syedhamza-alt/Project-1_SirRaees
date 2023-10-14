package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityRecyclerBinding

class recyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)


       binding.recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>(

        )


        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.img_2, "Person " + i))
        }

        val adapter = CustomAdapter(data)

        binding.recyclerview.adapter = adapter

    }
}