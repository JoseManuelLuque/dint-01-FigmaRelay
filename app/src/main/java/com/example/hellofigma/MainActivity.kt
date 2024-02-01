/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.hellofigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hellofigma.Biografia.Biografia
import com.example.hellofigma.Equipo.Equipo
import com.example.hellofigma.Estadisticas.Estadisticas
import com.example.hellofigma.Inicio.Inicio
import com.example.hellofigma.Premios.Premios
import com.example.hellofigma.Trayectoria.Trayectoria
import com.example.hellofigma.ui.theme.HelloFigmaTheme
import kotlin.system.exitProcess
import android.content.Intent
import android.net.Uri

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloFigmaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "Inicio") {
                        composable("Inicio") {
                            Inicio(navController = navController)
                        }

                        composable("Equipo") {
                            Equipo(navController = navController)
                        }

                        composable("Trayectoria") {
                            Trayectoria(navController = navController)
                        }

                        composable("Estadisticas") {
                            Estadisticas(navController = navController)
                        }

                        composable("Premios") {
                            Premios(navController = navController)
                        }

                        composable("Biografia") {
                            Biografia(navController = navController)
                        }

                        val uri = "https://www.formula1.com/en/results.html/2023/races/1226/abu-dhabi/race-result.html"
                        composable("Temporada") {

                        }

                        composable("Salir") {
                            exitProcess(1)
                        }


                    }
                }
            }
        }
    }
}