package com.example.hellofigma.Premios

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hellofigma.R
import com.google.relay.compose.Case
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'pagina_premios_app'.
 * Generated code; do not edit directly
 */
@Composable
fun Premios(modifier: Modifier = Modifier, navController: NavHostController) {
    TopLevel(modifier = modifier) {
        TimeLine(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -5.0.dp,
                    y = 96.0.dp
                )
            )
        ) {
            Class2023 {
                Line2023(modifier = Modifier.columnWeight(1.0f)) {
                    Start2023 {
                        Ellipse()
                    }
                    Rectangle2023(modifier = Modifier.columnWeight(1.0f))
                }
                Info2023(modifier = Modifier.rowWeight(1.0f)) {
                    Title2023(modifier = Modifier.rowWeight(1.0f))
                    PREMIO2023(modifier = Modifier.rowWeight(1.0f))
                }
            }
            Class2022 {
                Line2022(modifier = Modifier.columnWeight(1.0f)) {
                    Start2022 {
                        Ellipse2()
                    }
                    Rectangle2022(modifier = Modifier.columnWeight(1.0f))
                }
                Info2022(modifier = Modifier.rowWeight(1.0f)) {
                    Title2022(modifier = Modifier.rowWeight(1.0f))
                    PREMIO2022(modifier = Modifier.rowWeight(1.0f))
                }
            }
            Class2021 {
                Line2021(modifier = Modifier.columnWeight(1.0f)) {
                    Start2021 {
                        Ellipse4()
                    }
                    Rectangle2021(modifier = Modifier.columnWeight(1.0f))
                }
                Info2021(modifier = Modifier.rowWeight(1.0f)) {
                    Title2021(modifier = Modifier.rowWeight(1.0f))
                    PREMIO2021(modifier = Modifier.rowWeight(1.0f))
                }
            }
            Class2013 {
                Line2013(modifier = Modifier.columnWeight(1.0f)) {
                    Start2013 {
                        Ellipse6()
                    }
                    Rectangle2013(modifier = Modifier.columnWeight(1.0f))
                }
                Info2013(modifier = Modifier.rowWeight(1.0f)) {
                    Title2013(modifier = Modifier.rowWeight(1.0f))
                    PREMIO2013(modifier = Modifier.rowWeight(1.0f))
                }
            }
            Class2012 {
                Line2012(modifier = Modifier.columnWeight(1.0f)) {
                    Start2012 {
                        Ellipse8()
                    }
                    Rectangle2012(modifier = Modifier.columnWeight(1.0f))
                }
                Info2012(modifier = Modifier.rowWeight(1.0f)) {
                    Title2012(modifier = Modifier.rowWeight(1.0f))
                    PREMIO2012(modifier = Modifier.rowWeight(1.0f))
                }
            }
            Class2011 {
                Line2011(modifier = Modifier.columnWeight(1.0f)) {
                    Start2011 {
                        Ellipse10()
                    }
                    Rectangle2011(modifier = Modifier.columnWeight(1.0f))
                }
                Info2011(modifier = Modifier.rowWeight(1.0f)) {
                    Title2011(modifier = Modifier.rowWeight(1.0f))
                    PREMIO2011(modifier = Modifier.rowWeight(1.0f))
                }
            }
            Class2010 {
                Line2010(modifier = Modifier.columnWeight(1.0f)) {
                    Start2010 {
                        Ellipse12()
                    }
                    Rectangle2010(modifier = Modifier.columnWeight(1.0f))
                }
                Info2010(modifier = Modifier.rowWeight(1.0f)) {
                    Title2010(modifier = Modifier.rowWeight(1.0f))
                    PREMIO2010(modifier = Modifier.rowWeight(1.0f))
                }
            }
            Class2024 {
                Line2014(modifier = Modifier.columnWeight(1.0f)) {
                    Start2014 {
                        Ellipse14()
                    }
                    Rectangle2014(modifier = Modifier.columnWeight(1.0f))
                }
                Info2014(modifier = Modifier.rowWeight(1.0f)) {
                    Title2014(modifier = Modifier.rowWeight(1.0f))
                    PREMIO2014(modifier = Modifier.rowWeight(1.0f))
                }
            }
            Class2005 {
                Line2005(modifier = Modifier.columnWeight(1.0f)) {
                    Start2005 {
                        Ellipse16()
                    }
                    Rectangle2005(modifier = Modifier.columnWeight(1.0f))
                }
                Info2005(modifier = Modifier.rowWeight(1.0f)) {
                    Title2005(modifier = Modifier.rowWeight(1.0f))
                    PREMIO2005(modifier = Modifier.rowWeight(1.0f))
                }
            }
        }
        TopAppBar(modifier = Modifier.rowWeight(1.0f)) {
            PremiosAppBar(modifier = Modifier.rowWeight(1.0f))
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
fun Ellipse(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_ellipse),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Start2023(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle2023(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_rectangle_2023),
        modifier = modifier.requiredWidth(4.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line2023(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Title2023(modifier: Modifier = Modifier) {
    RelayText(
        content = "2023",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 202,
            green = 255,
            blue = 185
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PREMIO2023(modifier: Modifier = Modifier) {
    RelayText(
        content = "PREMIO ACCION DEL AÑO DE LA FIA",
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
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Info2023(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 48.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Class2023(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(332.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_ellipse1),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Start2022(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle2022(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_rectangle_2022),
        modifier = modifier.requiredWidth(4.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line2022(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Title2022(modifier: Modifier = Modifier) {
    RelayText(
        content = "2022",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 202,
            green = 255,
            blue = 185
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PREMIO2022(modifier: Modifier = Modifier) {
    RelayText(
        content = "PREMIO CONFARTIGIANATO MOTORI AL MEJOR PILOTO DEL AÑO",
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
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Info2022(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 48.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Class2022(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(68.0.dp)
    )
}

@Composable
fun Ellipse4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_ellipse2),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Start2021(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle2021(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_rectangle_2021),
        modifier = modifier.requiredWidth(4.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line2021(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Title2021(modifier: Modifier = Modifier) {
    RelayText(
        content = "2021",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 202,
            green = 255,
            blue = 185
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PREMIO2021(modifier: Modifier = Modifier) {
    RelayText(
        content = "PREMIO ACCION DEL AÑO FIA",
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
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Info2021(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 48.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Class2021(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(326.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Ellipse6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_ellipse3),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Start2013(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle2013(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_rectangle_2013),
        modifier = modifier.requiredWidth(4.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line2013(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Title2013(modifier: Modifier = Modifier) {
    RelayText(
        content = "2013",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 202,
            green = 255,
            blue = 185
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PREMIO2013(modifier: Modifier = Modifier) {
    RelayText(
        content = "PREMIO BBC ADELANTAMIENTO DEL AÑO",
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
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Info2013(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 48.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Class2013(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(326.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Ellipse8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_ellipse4),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Start2012(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle2012(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_rectangle_2012),
        modifier = modifier.requiredWidth(4.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line2012(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Title2012(modifier: Modifier = Modifier) {
    RelayText(
        content = "2012",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 202,
            green = 255,
            blue = 185
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PREMIO2012(modifier: Modifier = Modifier) {
    RelayText(
        content = "PREMIO BBC ADELANTAMIENTO DEL AÑO",
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
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Info2012(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 48.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Class2012(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(326.0.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Ellipse10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_ellipse5),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Start2011(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle2011(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_rectangle_2011),
        modifier = modifier.requiredWidth(4.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line2011(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Title2011(modifier: Modifier = Modifier) {
    RelayText(
        content = "2011",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 202,
            green = 255,
            blue = 185
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PREMIO2011(modifier: Modifier = Modifier) {
    RelayText(
        content = "PREMIO INTERNACIONAL DEL DELPORTE DE LA COMUNIDAD DE MADRID",
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
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(19.0.dp)
    )
}

@Composable
fun Info2011(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 48.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Class2011(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(326.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun Ellipse12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_ellipse6),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Start2010(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle2010(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_rectangle_2010),
        modifier = modifier.requiredWidth(4.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line2010(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Title2010(modifier: Modifier = Modifier) {
    RelayText(
        content = "2010",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 202,
            green = 255,
            blue = 185
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PREMIO2010(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 255,
                        blue = 255
                    ),
                    fontFamily = dosis,
                    fontSize = 16.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("TROFEO DHL VUELTA RAPIDA")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = dosis,
                    fontSize = 16.0.sp,
                    letterSpacing = 0.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("TROFEO DHL VUELTA RAPIDA\n\nMEJOR PILOTO POR LOS JEFES DE EQUIPO")
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
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(19.0.dp)
    )
}

@Composable
fun Info2010(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 48.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Class2010(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(332.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun Ellipse14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_ellipse7),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Start2014(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle2014(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_rectangle_2014),
        modifier = modifier.requiredWidth(4.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line2014(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Title2014(modifier: Modifier = Modifier) {
    RelayText(
        content = "2006",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 202,
            green = 255,
            blue = 185
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PREMIO2014(modifier: Modifier = Modifier) {
    RelayText(
        content = "PREMIO INTERNATIONAL RACING DRIVER\n\nMEDALLA DE ORO - REAL ORDEN DEL MERITO DEPORTIVO",
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
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(19.0.dp)
    )
}

@Composable
fun Info2014(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 48.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Class2024(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(332.0.dp).requiredHeight(111.0.dp)
    )
}

@Composable
fun Ellipse16(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_ellipse8),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Start2005(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle2005(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_rectangle_2005),
        modifier = modifier.requiredWidth(4.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line2005(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Title2005(modifier: Modifier = Modifier) {
    RelayText(
        content = "2005",
        fontSize = 16.0.sp,
        fontFamily = dosis,
        color = Color(
            alpha = 255,
            red = 202,
            green = 255,
            blue = 185
        ),
        height = 1.2640000581741333.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PREMIO2005(modifier: Modifier = Modifier) {
    RelayText(
        content = "HIJO PREDILECTO DE OVIEDO \n\nPREMIO NACIONAL DEL DEPORTE - MEJOR DEPORTISTA DEL AÑO\n\nPREMIO PRINCIPE DE ASTURIAS DE LOS DEPORTES ",
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
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(19.0.dp)
    )
}

@Composable
fun Info2005(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 0.0.dp,
            bottom = 48.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Class2005(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(332.0.dp).requiredHeight(173.0.dp)
    )
}

@Composable
fun TimeLine(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 16.0,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(872.0.dp)
    )
}

@Composable
fun PremiosAppBar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Premios",
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
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun IconoMenu(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pagina_premios_app_icono_menu),
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
