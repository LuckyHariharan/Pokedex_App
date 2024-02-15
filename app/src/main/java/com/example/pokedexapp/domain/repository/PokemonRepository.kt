package com.example.pokedexapp.domain.repository

import com.example.pokedexapp.domain.model.Pokemon

// domain/repository/PokemonRepository.kt
interface PokemonRepository {
    suspend fun getPokemonFromAPI(): List<Pokemon>
    suspend fun getPokemonFromDB(): List<Pokemon>
    suspend fun savePokemon(pokemon: List<Pokemon>)
}
