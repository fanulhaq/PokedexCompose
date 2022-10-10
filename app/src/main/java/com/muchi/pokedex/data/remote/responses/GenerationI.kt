/*
 * Copyright (c)  - Irfanul Haq
 */

package com.muchi.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationI(
    @SerializedName("red-blue")
    val redBlue: RedBlue,
    val yellow: Yellow
)
