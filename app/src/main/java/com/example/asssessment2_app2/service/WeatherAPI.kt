package com.example.asssessment2_app2.service

import android.location.Location
import com.example.asssessment2_app2.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.openweathermap.org/data/2.5/weather?q=ajman&appid=65391441fbf1f23b57f4066e6c543c15

interface WeatherAPI {

    @GET("data/2.5/weather?&units=metric&APPID=65391441fbf1f23b57f4066e6c543c15")
    fun getData(
        @Query("q") location: String
    ): Single<WeatherModel>

}