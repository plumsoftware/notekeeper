package ru.plumsoftware.notekeeper.presentation.notekeepericonpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.plumsoftware.notekeeper.presentation.NotekeeperIconPack

public val NotekeeperIconPack.`Bell-fill`: ImageVector
    get() {
        if (`_bell-fill` != null) {
            return `_bell-fill`!!
        }
        `_bell-fill` = Builder(name = "Bell-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 23.9998f)
                    curveTo(12.7956f, 23.9998f, 13.5587f, 23.6838f, 14.1213f, 23.1212f)
                    curveTo(14.6839f, 22.5586f, 15.0f, 21.7955f, 15.0f, 20.9998f)
                    horizontalLineTo(9.0f)
                    curveTo(9.0f, 21.7955f, 9.3161f, 22.5586f, 9.8787f, 23.1212f)
                    curveTo(10.4413f, 23.6838f, 11.2044f, 23.9998f, 12.0f, 23.9998f)
                    close()
                    moveTo(13.4925f, 1.6484f)
                    curveTo(13.5134f, 1.4398f, 13.4904f, 1.2291f, 13.4249f, 1.03f)
                    curveTo(13.3595f, 0.8309f, 13.253f, 0.6477f, 13.1124f, 0.4922f)
                    curveTo(12.9717f, 0.3368f, 12.8001f, 0.2125f, 12.6085f, 0.1275f)
                    curveTo(12.4169f, 0.0425f, 12.2096f, -0.0015f, 12.0f, -0.0015f)
                    curveTo(11.7904f, -0.0015f, 11.5831f, 0.0425f, 11.3915f, 0.1275f)
                    curveTo(11.1999f, 0.2125f, 11.0283f, 0.3368f, 10.8876f, 0.4922f)
                    curveTo(10.747f, 0.6477f, 10.6405f, 0.8309f, 10.5751f, 1.03f)
                    curveTo(10.5096f, 1.2291f, 10.4866f, 1.4398f, 10.5075f, 1.6484f)
                    curveTo(8.8121f, 1.9932f, 7.2879f, 2.9134f, 6.1932f, 4.2531f)
                    curveTo(5.0984f, 5.5928f, 4.5002f, 7.2697f, 4.5f, 8.9999f)
                    curveTo(4.5f, 10.6468f, 3.75f, 17.9998f, 1.5f, 19.4998f)
                    horizontalLineTo(22.5f)
                    curveTo(20.25f, 17.9998f, 19.5f, 10.6468f, 19.5f, 8.9999f)
                    curveTo(19.5f, 5.3699f, 16.92f, 2.3398f, 13.4925f, 1.6484f)
                    close()
                }
            }
        }
        .build()
        return `_bell-fill`!!
    }

private var `_bell-fill`: ImageVector? = null
