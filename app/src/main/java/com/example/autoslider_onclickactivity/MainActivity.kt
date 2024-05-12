package com.example.autoslider_onclickactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.autoslider_onclickactivity.sliderdata.ImageDataProvider
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var imageDataProvider: ImageDataProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        imageDataProvider = ImageDataProvider(this, viewPager, tabLayout)
    }

    override fun onDestroy() {
        super.onDestroy()
        imageDataProvider.stopAutoScrollViewPager()
    }
}