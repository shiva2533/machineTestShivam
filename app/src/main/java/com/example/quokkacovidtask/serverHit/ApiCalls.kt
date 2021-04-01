package com.example.quokkacovidtask.serverHit

import com.example.quokkacovidtask.model.CovidStatusList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiCalls {
    @GET("live/country/{country}/status/confirmed")
    suspend fun getCovidStatus(@Path("country") country: String): Response<CovidStatusList>
}