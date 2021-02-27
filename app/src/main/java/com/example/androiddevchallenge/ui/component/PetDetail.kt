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

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.util.PetResource

@Composable
fun PetDetail(id: Int) {
    val pet = PetResource.findById(id)
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(pet.name, fontSize = 32.sp)
        Text("age:" + pet.age.toString())
    }
}

@Preview("Pet detail", widthDp = 360, heightDp = 640)
@Composable
fun PreviewDetail() {
    PetDetail(0)
}
