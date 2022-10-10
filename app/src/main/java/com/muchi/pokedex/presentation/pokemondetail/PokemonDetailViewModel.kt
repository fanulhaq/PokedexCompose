/*
 * Copyright (c)  - Irfanul Haq
 */

package com.muchi.pokedex.presentation.pokemondetail

import androidx.lifecycle.ViewModel
import com.muchi.pokedex.common.Resource
import com.muchi.pokedex.data.remote.responses.Pokemon
import com.muchi.pokedex.data.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}