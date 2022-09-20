package com.example.loginapirest

import android.content.Context
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class ReqResAPI constructor(context: Context) {
    fun addToRequestQueue(jsonObjectRequest: JsonObjectRequest) {

    }

    companion object{
        @Volatile
        private var INSTANCE: ReqResAPI? = null

        fun getInstance(context: Context) = INSTANCE ?: synchronized(this){
            INSTANCE ?: ReqResAPI(context).also { INSTANCE = it }
        }
    }

    val requestQueue: RequestQueue by lazy {
        Volley.newRequestQueue(context.applicationContext)
    }

    /*fun <T> addToRequestQueue(req: Request<T>){
        requestQueue.add(req)
    }*/
}