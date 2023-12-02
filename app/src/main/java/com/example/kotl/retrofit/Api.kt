package com.example.kotl.retrofit

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("products/{id}")
    suspend fun getProductById(@Path("id") id:Int): Product

    @GET("products")
    suspend fun getAllProducts(): Products

    @GET("products/search")
    suspend fun getProductsByName(@Query("q") name: String): Products
}