/*
 * Copyright (c)  - Irfanul Haq
 */

package com.muchi.pokedex.data.remote.responses

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)
