package com.example.hellofigma.Equipo

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hellofigma.R
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'pagina_equipo_app'.
 * Generated code; do not edit directly
 */
@Composable
fun Equipo(modifier: Modifier = Modifier, navController: NavHostController) {
    TopLevel(modifier = modifier) {
        LayoutEquipo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = -96.0.dp,
                    y = 104.0.dp
                )
            )
        ) {
            Equipo {
                TextoEquipo(modifier = Modifier.rowWeight(1.0f))
                IconoAstonMartin(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 32.0.dp
                        )
                    ).rowWeight(1.0f)
                )
            }
            Patrocinadores {
                Patrocinadores(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.CenterStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -54.33962440490723.dp
                        )
                    ).rowWeight(1.0f)
                )
                CognizantBlack2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.CenterStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -10.867940902709961.dp
                        )
                    ).rowWeight(1.0f)
                )
                AramcoBlack2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.CenterStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 45.7358283996582.dp
                        )
                    ).rowWeight(1.0f)
                )
            }
            CompaEro {
                Lance(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 96.0.dp,
                            y = 0.0.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
                TextoCompaEro(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 128.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    CompaEro(modifier = Modifier.columnWeight(1.0f))
                    LanceStroll(modifier = Modifier.columnWeight(1.0f))
                }
            }
        }
        TopAppBarEquipo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            TextoEquipoTopBar()
            CapaMenuEquipo(
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
fun TextoEquipo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Equipo:",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2640000581741333.em,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.0.dp,
                top = 0.0.dp,
                end = 6.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).requiredHeight(39.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun IconoAstonMartin(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_equipo_app_icono_aston_martin),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(102.0.dp)
    )
}

@Composable
fun Equipo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(339.0.dp).requiredHeight(134.0.dp)
    )
}

@Composable
fun Patrocinadores(modifier: Modifier = Modifier) {
    RelayText(
        content = "Patrocinadores:",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2640000581741333.em,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(35.32075119018555.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun CognizantBlack2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_equipo_app_cognizant_black_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.7155914306640625.dp,
                top = 0.0.dp,
                end = 0.0000457763671875.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).requiredHeight(51.62263870239258.dp)
    )
}

@Composable
fun AramcoBlack2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_equipo_app_aramco_black_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.7155914306640625.dp,
                top = 0.0.dp,
                end = 0.0000457763671875.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).requiredHeight(52.528297424316406.dp)
    )
}

@Composable
fun Patrocinadores(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(144.0.dp)
    )
}

@Composable
fun Lance(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pagina_equipo_app_lance),
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CompaEro(modifier: Modifier = Modifier) {
    RelayText(
        content = "Compañero:",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2640000581741333.em,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 21.999937057495117.dp
            )
        ).requiredWidth(83.0.dp).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun LanceStroll(modifier: Modifier = Modifier) {
    RelayText(
        content = "Lance Stroll",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2640000581741333.em,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 20.99993896484375.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(83.0.dp).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TextoCompaEro(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(83.0.dp).requiredHeight(40.99993896484375.dp)
    )
}

@Composable
fun CompaEro(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(553.0.dp).requiredHeight(414.0000305175781.dp)
    )
}

@Composable
fun LayoutEquipo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 71.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TextoEquipoTopBar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Equipo",
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
        vector = painterResource(R.drawable.pagina_equipo_app_icono_menu),
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
fun CapaMenuEquipo(
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
fun TopAppBarEquipo(
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
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 760.000057220459.dp
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
