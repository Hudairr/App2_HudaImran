package com.example.asssessment2_app2.service

import com.example.asssessment2_app2.model.WeatherModel
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WeatherAPIService {

    //https://api.openweathermap.org/data/2.5/weather?q=ajman&appid=65391441fbf1f23b57f4066e6c543c15

    private val BASE_URL= "http://api.openweathermap.org/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(WeatherAPI::class.java)

    fun getDataService(location: String) : Single<WeatherModel>{
        return api.getData(location)
    }
}