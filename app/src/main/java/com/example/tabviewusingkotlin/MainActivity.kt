package com.example.tabviewusingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tabviewusingkotlin.Adapter.PageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = PageAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)

    }
}
