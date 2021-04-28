package main

import controller.AdopterController
import model.AdopterModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import utils.NetworkUtils

class MainClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            getData()
        }

        fun getData() {
            val retrofitClient = NetworkUtils
                .getRetrofitInstance("https://jsonplaceholder.typicode.com")

            val endpoint = retrofitClient.create(AdopterController::class.java)
            val callback = endpoint.getPosts()

            callback.enqueue(object : Callback<List<AdopterModel>> {
                override fun onFailure(call: Call<List<AdopterModel>>, t: Throwable) {
                    print("deu merda")
                }

                override fun onResponse(call: Call<List<AdopterModel>>, response: Response<List<AdopterModel>>) {
                    response.body()?.forEach {
                        print(it.body)
                    }
                }
            })

        }
    }
}


