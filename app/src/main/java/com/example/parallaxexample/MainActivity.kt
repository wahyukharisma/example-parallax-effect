package com.example.parallaxexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parallaxexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val items : MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initItems()

        with(binding){
            rvContent.adapter = ItemAdapter(items)
        }
    }

    private fun initItems(){
        for( i in 1..20){
            items.add("Data Number $i")
        }
    }
}