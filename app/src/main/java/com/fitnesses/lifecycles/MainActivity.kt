package com.fitnesses.lifecycles

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.fitnesses.lifecycles.databinding.ActivityMainBinding
import com.fitnesses.lifecycles.network.Resource
import com.fitnesses.lifecycles.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        Log.d("DATA", "onCreate:")
        viewModel.data.observe(this){

            when(it){
                is Resource.Loading->{
                    Toast.makeText(this, "Loading", Toast.LENGTH_SHORT).show()
                }
                is Resource.Error -> {
                    Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                }
                is Resource.Success -> {
                    Toast.makeText(this, it.data?.activity, Toast.LENGTH_SHORT).show()
                }
            }

            Log.d("DATA", "onCreate: $it")
        }

    }
}