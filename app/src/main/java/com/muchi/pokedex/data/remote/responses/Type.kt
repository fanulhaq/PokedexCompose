/*
 * Copyright (c)  - Irfanul Haq
 */

package com.muchi.pokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Type(
    val slot: Int,
    val type: TypeX
)