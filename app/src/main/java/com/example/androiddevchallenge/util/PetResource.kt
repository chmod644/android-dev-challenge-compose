package com.example.androiddevchallenge.util

import android.util.Log
import com.example.androiddevchallenge.model.Pet

object PetResource {
    val TAG = "PetResource"
    val pets: MutableList<Pet> = mutableListOf(
        Pet(0, "Lucky", 3),
        Pet(1, "Google", 4),
        Pet(2, "Android", 5),
    )

    fun findById(id: Int): Pet {
        Log.d(TAG, "findById: id is ${id}")
        return pets.first { it.id == id }
    }
}