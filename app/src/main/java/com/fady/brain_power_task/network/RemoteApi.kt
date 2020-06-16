package com.fady.brain_power_task.network

import com.fady.brain_power_task.model.Athlete
import retrofit2.http.GET

interface RemoteApi {
    @GET("athletes.josn/")
    fun getAllAthletes(): List<Athlete>
}