/*
 * Copyright (c)  - Irfanul Haq
 */

package com.muchi.pokedex.data.remote

import com.muchi.pokedex.data.remote.responses.Pokemon
import com.muchi.pokedex.data.remote.responses.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name: String
    ): Pokemon
}
