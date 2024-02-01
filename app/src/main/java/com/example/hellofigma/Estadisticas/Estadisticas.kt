package com.example.hellofigma.Estadisticas

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hellofigma.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'pagina_estad_sticas_app'.
 * Generated code; do not edit directly
 */
@Composable
fun Estadisticas(modifier: Modifier = Modifier, navController: NavHostController) {
    TopLevel(modifier = modifier) {
        EstadSticasF1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 40.0.dp
                )
            )
        )
        Iconos(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 232.0.dp,
                    y = 55.0.dp
                )
            )
        ) {
            IconoF1()
            IconoCopa()
            IconoMedalla()
            IconoBandera()
            IconoPodio()
            IconoCasco()
            IconoCrono()
            IconoPuntos()
        }
        TopAppBar {
            Stats()
            CapaIconoEquipo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 302.0.dp,
                        y = -1.0.dp
                    )
                )
            ) {
                IconoMenu(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
    }
}

@Composable
fun EstadSticasF1(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append(" \n")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 202,
                        green = 255,
                        blue = 185
                    ),
                    fontFamily = dosis,
                    fontSize = 38.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("20 ")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Temporadas en F1\n")
            }
            append("\n")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 202,
                        green = 255,
                        blue = 185
                    ),
                    fontFamily = dosis,
                    fontSize = 38.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("2 ")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Veces campeón\n")
            }
            append("\n")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 202,
                        green = 255,
                        blue = 185
                    ),
                    fontFamily = dosis,
                    fontSize = 38.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("376 ")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Carreras (récord)\n\n")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 202,
                        green = 255,
                        blue = 185
                    ),
                    fontFamily = dosis,
                    fontSize = 38.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("32 ")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Victorias \n")
            }
            append("\n")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 202,
                        green = 255,
                        blue = 185
                    ),
                    fontFamily = dosis,
                    fontSize = 38.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("106 ")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Podios\n")
            }
            append("\n")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 202,
                        green = 255,
                        blue = 185
                    ),
                    fontFamily = dosis,
                    fontSize = 38.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("22 ")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Poles\n")
            }
            append("\n")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 202,
                        green = 255,
                        blue = 185
                    ),
                    fontFamily = dosis,
                    fontSize = 38.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("24 ")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Vueltas rápidas\n")
            }
            append("\n")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 202,
                        green = 255,
                        blue = 185
                    ),
                    fontFamily = dosis,
                    fontSize = 38.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("2.259 ")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Puntos")
            }
        },
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(232.0.dp).requiredHeight(742.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun IconoF1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_estad_sticas_app_icono_f1),
        modifier = modifier.requiredWidth(104.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun IconoCopa(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_estad_sticas_app_icono_copa),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(74.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun IconoMedalla(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_estad_sticas_app_icono_medalla),
        modifier = modifier.requiredWidth(81.0.dp).requiredHeight(82.0.dp)
    )
}

@Composable
fun IconoBandera(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_estad_sticas_app_icono_bandera),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun IconoPodio(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_estad_sticas_app_icono_podio),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun IconoCasco(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_estad_sticas_app_icono_casco),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(77.0.dp).requiredHeight(77.0.dp)
    )
}

@Composable
fun IconoCrono(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_estad_sticas_app_icono_crono),
        modifier = modifier.requiredWidth(67.0.dp).requiredHeight(67.0.dp)
    )
}

@Composable
fun IconoPuntos(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_estad_sticas_app_icono_puntos),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(62.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun Iconos(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 21.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(745.0.dp)
    )
}

@Composable
fun Stats(modifier: Modifier = Modifier) {
    RelayText(
        content = "Estadísticas",
        fontSize = 26.0.sp,
        fontFamily = acme,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.266000014085036.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun IconoMenu(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_estad_sticas_app_icono_menu),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 20.0.dp,
                top = 14.0.dp,
                end = 20.0.dp,
                bottom = 14.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CapaIconoEquipo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(58.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun TopAppBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 173,
            green = 247,
            blue = 142
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 1,
            green = 86,
            blue = 79
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
