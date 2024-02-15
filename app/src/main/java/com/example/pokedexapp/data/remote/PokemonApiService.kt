package com.example.pokedexapp.data.remote

import com.example.pokedexapp.domain.model.Pokemon
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApiService {
    @GET("pokemon")
    suspend fun getPokemon(): Response<List<Pokemon>>
}
