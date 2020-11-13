package com.core.data_04.api

import com.core.data_04.models.ProductList
import retrofit2.Call
import retrofit2.http.GET

/**
 *  This Interface defines our REST API
 *
 */
interface ProductAPI {
    @GET("/miami_auto/core/bridge_line_1/data/json_data_miami_auto.json")
    fun getProducts() : Call<ProductList>
}




