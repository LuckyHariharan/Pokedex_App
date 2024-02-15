package com.example.pokedexapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pokedexapp.domain.model.Pokemon

// data/local/AppDatabase.kt
@Database(entities = [Pokemon::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun pokemonDao(): PokemonDao
}
