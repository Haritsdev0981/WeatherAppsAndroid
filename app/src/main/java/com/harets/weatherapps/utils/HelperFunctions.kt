package com.harets.weatherapps.utils

import java.math.RoundingMode

object HelperFunctions {

    fun formatterDegree(temperature: Double?) : String{
        val temp = temperature as Double
        val tempToCelcius = temp - 273.0
        val formatDegre = tempToCelcius.toBigDecimal()
            .setScale(2, RoundingMode.CEILING)
        return "$formatDegre °C"
    }
}