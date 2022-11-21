package com.fitnesses.lifecycles

fun main() {
    Demo<Int>().apply {
        data = 100
        getData<String>()
    }

}


class Demo<T> {
    var data: T? = null

    fun <T> getData() {
        println(data)
    }
}


sealed class Resource <out T> (val data:T?=null) {

    object Loading
    class Success<out R  > : Resource<R>()
    class Error : Resource<R>()




}