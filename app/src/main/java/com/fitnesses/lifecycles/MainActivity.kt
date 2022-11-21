package com.fitnesses.lifecycles

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.fitnesses.lifecycles.services.PagerAdapter
import com.google.android.material.progressindicator.LinearProgressIndicator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(ConstantTags.SECOND_ACTIVITY_TAG, "MainActivity onCreate: ")
        Log.d(ConstantTags.COMMON_TAG, "MainActivity onCreate: ")
        findViewById<TextView>(R.id.navigate).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
//        val uri =
//            Uri.parse("https://www.fitbit.com/oauth2/authorize?response_type=code&client_id=23B527&redirect_uri=https://app.fitticoins.com:2053/FittiCoinWebApi_live3/V4.0/&scope=activity&expires_in=31536000")
//        startActivity(Intent(Intent.ACTION_VIEW, uri))


        val list = ArrayList<String>()
        list.apply {
            add("Hello")
            add("This")
            add("is")
            add("ViewPager")
        }
        val pager: ViewPager2 = findViewById(R.id.pager)
        val pBar: LinearProgressIndicator = findViewById(R.id.pBar)
        val ad = PagerAdapter(list)
        pager.adapter = ad
        var limit = true
        var value = 0.0
        var position = 0

        while (limit) {
            value += 0.5
            if (value > 100) {
                position++
                pager.currentItem = position
                limit = false
            }

            pBar.setProgress(value.toInt(), true)

        }

        pager.apply {


        }

    }

    override fun onResume() {
        super.onResume()
        Log.d(ConstantTags.MAIN_ACTIVITY_TAG, "MainActivity onResume: ")
        Log.d(ConstantTags.COMMON_TAG, "MainActivity onResume: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(ConstantTags.MAIN_ACTIVITY_TAG, "MainActivity onStart: ")
        Log.d(ConstantTags.COMMON_TAG, "MainActivity onStart: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(ConstantTags.MAIN_ACTIVITY_TAG, "MainActivity onPause: ")
        Log.d(ConstantTags.COMMON_TAG, "MainActivity onPause: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ConstantTags.MAIN_ACTIVITY_TAG, "MainActivity onRestart: ")
        Log.d(ConstantTags.COMMON_TAG, "MainActivity onRestart: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(ConstantTags.MAIN_ACTIVITY_TAG, "MainActivity onStop: ")
        Log.d(ConstantTags.COMMON_TAG, "MainActivity onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ConstantTags.MAIN_ACTIVITY_TAG, "MainActivity onDestroy: ")
        Log.d(ConstantTags.COMMON_TAG, "MainActivity onDestroy: ")
    }
}