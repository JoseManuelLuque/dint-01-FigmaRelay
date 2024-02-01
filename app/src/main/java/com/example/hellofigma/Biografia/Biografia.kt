package com.example.hellofigma.Biografia

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
 * This composable was generated from the UI Package 'pagina_biografia_app'.
 * Generated code; do not edit directly
 */
@Composable
fun Biografia(modifier: Modifier = Modifier, navController: NavHostController) {
    TopLevel(modifier = modifier) {
        Firma(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 194.0.dp,
                    y = 170.0.dp
                )
            )
        )
        DatosBAsicos(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 16.0.dp,
                    y = 56.0.dp
                )
            )
        )
        TextoBiografia(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 20.0.dp,
                    y = 215.0.dp
                )
            )
        )
        TopAppBar(modifier = Modifier.rowWeight(1.0f)) {
            Stats()
            CapaIconoEquipo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopEnd,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                IconoMenu(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
    }
}

@Composable
fun Firma(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_biografia_app_firma),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun DatosBAsicos(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 38.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Fernando Alonso Díaz\n")
            }
            append("Fecha de nacimiento: 29/07/1981\nEdad: 42 años\nPaís: España (nacido en Oviedo)\nDorsal: 14")
        },
        fontSize = 20.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2640000343322755.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(149.0.dp)
    )
}

@Composable
fun TextoBiografia(modifier: Modifier = Modifier) {
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
                append("Familia\n")
            }
            append("Hijo de Ana María Díaz Martínez y José Luis Alonso, un piloto amateur de karts, que quiso transmitir su pasión a sus hijos. Tiene una hermana mayor, Lorena. Su padre construyó un kart para Lorena, de ocho años, que no mostró interés y quedó para Fernando, que tenía tres años.\n\n")
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Estudios\n")
            }
            append("Desde los cuatro años hasta los catorce, estudió primaria y EGB en el colegio Santo Ángel de la Guarda, en Oviedo. Después cursó estudios en el instituto Leopoldo Alas Clarín de San Lázaro. Dejó los estudios en el 2000, para dedicarse al automovilismo.\n\n")
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Fórmula 3000\n")
            }
            append("En competición desde muy pequeño. En 2000 debutó en la Fórmula 3000 y logró la cuarta plaza final en dicho campeonato mundial, tras haber ganado la prueba belga de Spa, ser segundo en Hungría y sexto en Austria.\n\n")
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 20.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Fórmula")
            }
            append(" 1\nLa escudería European Minardi lo confirmó como uno de sus dos pilotos oficiales para el campeonato mundial 2001 de Fórmula 1.Sustituyó a ")
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 16.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Jenson Button")
            }
            append(" como piloto oficial del equipo Renault completando así la pareja de pilotos de la escudería francesa junto a Jarno Trulli.El 24 de marzo de 2003 logró su primer podio al terminar tercero en el Gran Premio de Malasia, segunda prueba de la temporada, disputada en el circuito de Sepang, en la que se impuso el finlandés ")
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 16.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Kimi Raikkonen")
            }
            append(" (McLaren).")
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
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(608.0.dp)
    )
}

@Composable
fun Stats(modifier: Modifier = Modifier) {
    RelayText(
        content = "Biografía",
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
        vector = painterResource(R.drawable.pagina_biografia_app_icono_menu),
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
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(40.0.dp)
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
