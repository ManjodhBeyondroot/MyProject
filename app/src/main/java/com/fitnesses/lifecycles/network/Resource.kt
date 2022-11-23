package com.fitnesses.lifecycles.network

import com.fitnesses.lifecycles.constants.Status

sealed class Resource<T>(val status: Status?=null, val data: T?=null, val message: String?=null) {
    class Success<T>(data: T?=null): Resource<T>(data = data)
    class Error<T>(errorMessage:String?=null) : Resource<T>(message = errorMessage)
    class Loading<T> : Resource<T>()
}

