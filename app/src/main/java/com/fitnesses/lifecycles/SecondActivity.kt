package com.fitnesses.lifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(ConstantTags.SECOND_ACTIVITY_TAG, "SecondActivity onCreate: ")
        Log.d(ConstantTags.COMMON_TAG, "SecondActivity onCreate: ")
    }
    override fun onStart() {
        super.onStart()
        Log.d(ConstantTags.SECOND_ACTIVITY_TAG, "SecondActivity onStart: ")
        Log.d(ConstantTags.COMMON_TAG, "SecondActivity onStart: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(ConstantTags.SECOND_ACTIVITY_TAG, "SecondActivity onPause: ")
        Log.d(ConstantTags.COMMON_TAG, "SecondActivity onPause: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ConstantTags.SECOND_ACTIVITY_TAG, "SecondActivity onRestart: ")
        Log.d(ConstantTags.COMMON_TAG, "SecondActivity onRestart: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(ConstantTags.SECOND_ACTIVITY_TAG, "SecondActivity onStop: ")
        Log.d(ConstantTags.COMMON_TAG, "SecondActivity onStop: ")
    }
    override fun onResume() {
        super.onResume()
        Log.d(ConstantTags.MAIN_ACTIVITY_TAG, "SecondActivity onResume: ")
        Log.d(ConstantTags.COMMON_TAG, "SecondActivity onResume: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ConstantTags.SECOND_ACTIVITY_TAG, "SecondActivity onDestroy: ")
        Log.d(ConstantTags.COMMON_TAG, "SecondActivity onDestroy: ")
    }
}