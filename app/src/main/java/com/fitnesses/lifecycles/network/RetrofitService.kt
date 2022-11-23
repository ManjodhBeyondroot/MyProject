package com.fitnesses.lifecycles.network

import com.fitnesses.lifecycles.constants.AppConstants.Companion.DATA_END_POINT
import com.fitnesses.lifecycles.models.DataModel
import dagger.Component
import dagger.Provides
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {

    @GET(DATA_END_POINT)
    suspend fun getData() : Response<Resource<DataModel>>

}