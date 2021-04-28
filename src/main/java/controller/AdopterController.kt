package controller

import model.AdopterModel
import retrofit2.Call
import retrofit2.http.GET

interface AdopterController {

    @GET("posts")
    fun getPosts() : Call<List<AdopterModel>>
}