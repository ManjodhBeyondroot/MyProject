package com.fitnesses.lifecycles.repositories

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.fitnesses.lifecycles.models.DataModel
import com.fitnesses.lifecycles.network.Resource
import com.fitnesses.lifecycles.network.RetrofitService
import javax.inject.Inject

class MainRepository @Inject constructor(private val retrofitService: RetrofitService) {

    val data: MutableLiveData<Resource<DataModel>> by lazy {
        MutableLiveData<Resource<DataModel>>()
    }

    suspend fun getData() {
        Log.d("TAG", "getData: ")
        val res = retrofitService.getData()
        if (res.isSuccessful) {
            data.postValue(res.body())
        }else{
            res.errorBody()?.close()
        }

    }

}