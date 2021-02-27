/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.component

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Pet
import com.example.androiddevchallenge.util.PetResource

@Composable
fun PetList(onClickPet: (Pet) -> Unit) {
    val pets = PetResource.pets
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        pets.forEach {
            PetRow(it, onClickPet)
        }
    }
}

@Composable
fun PetRow(pet: Pet, onClickPet: (Pet) -> Unit) {
    val TAG = "PetRow"
    ClickableText(
        text = AnnotatedString(pet.name),
        onClick = {
            Log.d(TAG, "PetRow: pet is ${pet}")
            onClickPet(pet)
        }
    )
}

@Preview("Pet list", widthDp = 360, heightDp = 640)
@Composable
fun PreviewList() {
    PetList {}
}

@Preview("Pet row", widthDp = 360, heightDp = 640)
@Composable
fun PreviewRow() {
    val pet = Pet(1, "Lucky", 3)
    PetRow(pet = pet) {}
}
