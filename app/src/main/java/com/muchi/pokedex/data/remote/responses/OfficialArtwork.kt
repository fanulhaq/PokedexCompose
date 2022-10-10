/*
 * Copyright (c)  - Irfanul Haq
 */

package com.muchi.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class OfficialArtwork(
    @SerializedName("front_default")
    val frontDefault: String
)
