package com.farasatnovruzov.retrofitkotlin.service

import Json4Kotlin_Base
import com.farasatnovruzov.retrofitkotlin.model1.Covid
import io.reactivex.rxjava3.core.Observable
import retrofit2.Call
import retrofit2.http.GET

interface ServiceAPI {

    //GET,POST,UPDATE,DELETE

    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json

    // https://raw.githubusercontent.com/owid/covid-19-data/master/public/data/latest/owid-covid-latest.json


    @GET("owid/covid-19-data/master/public/data/latest/owid-covid-latest.json")
//    fun  getData(): Call<Covid>
    fun  getData(): Observable<Covid>



//    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
//    fun  getData(): Call<List<DataModel>>
}