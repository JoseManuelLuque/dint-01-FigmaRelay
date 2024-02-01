package com.example.hellofigma.Inicio

import android.net.LinkAddress
import android.text.util.Linkify
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hellofigma.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'pagina_inicio_app'.
 * Generated code; do not edit directly
 */
@Composable
fun Inicio(modifier: Modifier = Modifier, navController: NavController) {
    TopLevel(modifier = modifier) {
        FERNANDOALONSOAPP(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        FotoAlonso(modifier = Modifier.columnWeight(1.0f))
        BotonesInicio(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            BotonEquipoInicio {
                FormaBotonEquipoInicio(navController = navController)
                TextoEquipoInicio(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 1.0.dp
                        )
                    )
                )
            }
            BotonEstadisticasInicio {
                FormaBotonEstadisticasInicio(navController = navController)
                TextoEstadisticasInicio()
            }
            BotonPremiosInicio {
                FormaBotonPremiosInicio(navController = navController)
                TextoPremiosInicio()
            }
            BotonBiografiaInicio {
                FormaBotonBiografiaInicio(navController = navController)
                TextoBiografAInicio()
            }
            BotonTrayectoriaInicio {
                FormaBotonTrayectoriaInicio(navController = navController)
                TextoTrayectoriaInicio()
            }
            BotonTemporadaInicio {
                FormaBotonTemporadaInicio()
                TextoTemporada2023Inicio()
            }
            BotonSalirInicio {
                FormaBotonSalir(navController = navController)
                SalirDeLaApp()
            }
        }
    }
}

@Composable
fun FERNANDOALONSOAPP(modifier: Modifier = Modifier) {
    RelayText(
        content = "FERNANDO ALONSO\nAPP",
        fontSize = 32.0.sp,
        fontFamily = josefinSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 702.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun FotoAlonso(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_inicio_app_foto_alonso),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 73.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(336.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun FormaBotonEquipoInicio(modifier: Modifier = Modifier, navController: NavController) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_inicio_app_forma_boton_equipo_inicio),
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).clickable { navController.navigate("Equipo") }
    )
}

@Composable
fun TextoEquipoInicio(modifier: Modifier = Modifier) {
    RelayText(
        content = "Equipo",
        fontSize = 20.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2640000343322755.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BotonEquipoInicio(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun FormaBotonEstadisticasInicio(modifier: Modifier = Modifier, navController: NavController) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_inicio_app_forma_boton_estadisticas_inicio),
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).clickable { navController.navigate("Estadisticas") }
    )
}

@Composable
fun TextoEstadisticasInicio(modifier: Modifier = Modifier) {
    RelayText(
        content = "Estadísticas",
        fontSize = 20.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2640000343322755.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BotonEstadisticasInicio(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun FormaBotonPremiosInicio(modifier: Modifier = Modifier, navController: NavController) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_inicio_app_forma_boton_premios_inicio),
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).clickable { navController.navigate("Premios") }
    )
}

@Composable
fun TextoPremiosInicio(modifier: Modifier = Modifier) {
    RelayText(
        content = "Premios",
        fontSize = 20.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2640000343322755.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BotonPremiosInicio(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun FormaBotonBiografiaInicio(modifier: Modifier = Modifier, navController: NavController) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_inicio_app_forma_boton_biografia_inicio),
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).clickable { navController.navigate("Biografia") }
    )
}

@Composable
fun TextoBiografAInicio(modifier: Modifier = Modifier) {
    RelayText(
        content = "Biografía",
        fontSize = 20.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2640000343322755.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BotonBiografiaInicio(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun FormaBotonTrayectoriaInicio(modifier: Modifier = Modifier, navController: NavController) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_inicio_app_forma_boton_trayectoria_inicio),
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).clickable { navController.navigate("Trayectoria") }
    )
}

@Composable
fun TextoTrayectoriaInicio(modifier: Modifier = Modifier) {
    RelayText(
        content = "Trayectoria",
        fontSize = 20.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2640000343322755.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BotonTrayectoriaInicio(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun FormaBotonTemporadaInicio(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_inicio_app_forma_boton_temporada_inicio),
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).clickable {/*TODO*/}
    )
}

@Composable
fun TextoTemporada2023Inicio(modifier: Modifier = Modifier) {
        RelayText(
        content = "Temporada 2023",
        fontSize = 20.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2640000343322755.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BotonTemporadaInicio(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun FormaBotonSalir(modifier: Modifier = Modifier, navController: NavController) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_inicio_app_forma_boton_salir),
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).clickable { navController.navigate("Salir") }
    )
}

@Composable
fun SalirDeLaApp(modifier: Modifier = Modifier) {
    RelayText(
        content = "Salir de la App",
        fontSize = 20.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2640000343322755.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BotonSalirInicio(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        content = content,
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun BotonesInicio(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.End,
        itemSpacing = 46.0,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 182.0.dp,
                top = 163.0.dp,
                end = 24.0.dp,
                bottom = 80.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
