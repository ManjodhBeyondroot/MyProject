package com.fitnesses.lifecycles.`package`

import retrofit2.http.GET

interface RetrofitService {

    @GET("")
    suspend fun getDataFromApi(){

    }

}