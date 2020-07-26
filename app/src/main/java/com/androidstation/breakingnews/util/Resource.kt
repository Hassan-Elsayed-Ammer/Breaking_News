package com.androidstation.breakingnews.util

// resource class recommended by google to  rab network responses by(Generic Class)
/*
 1- handling loading states
2-  handling  error response
4-  show successful  response
**sealed class its one type of abstract class
put  its has Feature  you can select witch class how can inhere from it
*/
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null

) {

    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data)
    class Loading<T> : Resource<T>()

}