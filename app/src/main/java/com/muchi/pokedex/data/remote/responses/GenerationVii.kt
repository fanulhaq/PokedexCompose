/*
 * Copyright (c)  - Irfanul Haq
 */

package com.muchi.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationVii(
    val icons: Icons,
    @SerializedName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoon
)
