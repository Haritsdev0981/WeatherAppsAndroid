package com.harets.weatherapps.data.network

import com.harets.weatherapps.BuildConfig
import com.harets.weatherapps.data.ForecastResponse
import com.harets.weatherapps.data.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather")
    fun weatherByCity(
        @Query("q") city: String,
        @Query("appid") apiKey: String? = BuildConfig.API_KEY
    ): Call<WeatherResponse>

    @GET("forecast")
    fun forecastByCity(
        @Query("q") city: String,
        @Query("appid") apiKey: String? = BuildConfig.API_KEY
    ): Call<ForecastResponse>

    // call this function when app first time open

    @GET("weather")
    fun weatherByCurrentLocation(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") apiKey: String? = BuildConfig.API_KEY
    ): Call<WeatherResponse>

    @GET("forecast")
    fun forecstByCurrentLocation(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") apiKey: String? = BuildConfig.API_KEY
    ): Call<ForecastResponse>

}