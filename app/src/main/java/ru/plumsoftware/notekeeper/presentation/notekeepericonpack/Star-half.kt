package ru.plumsoftware.notekeeper.presentation.notekeepericonpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.plumsoftware.notekeeper.presentation.NotekeeperIconPack

public val NotekeeperIconPack.`Star-half`: ImageVector
    get() {
        if (`_star-half` != null) {
            return `_star-half`!!
        }
        `_star-half` = Builder(name = "Star-half", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0338f, 7.6785f)
                    lineTo(11.3098f, 1.188f)
                    curveTo(11.3727f, 1.0574f, 11.471f, 0.9471f, 11.5935f, 0.8697f)
                    curveTo(11.716f, 0.7923f, 11.8578f, 0.7508f, 12.0028f, 0.75f)
                    curveTo(12.2773f, 0.75f, 12.5518f, 0.8955f, 12.7003f, 1.188f)
                    lineTo(15.9763f, 7.6785f)
                    lineTo(23.3233f, 8.7225f)
                    curveTo(23.5064f, 8.7513f, 23.674f, 8.8424f, 23.7978f, 8.9804f)
                    curveTo(23.9216f, 9.1184f, 23.994f, 9.2948f, 24.0028f, 9.48f)
                    curveTo(24.013f, 9.6033f, 23.9954f, 9.7273f, 23.9513f, 9.8428f)
                    curveTo(23.9071f, 9.9583f, 23.8376f, 10.0625f, 23.7478f, 10.1475f)
                    lineTo(18.4633f, 15.1815f)
                    lineTo(19.7083f, 22.2765f)
                    curveTo(19.8253f, 22.941f, 19.1683f, 23.4615f, 18.5893f, 23.1645f)
                    lineTo(12.0028f, 19.7805f)
                    lineTo(5.4193f, 23.1645f)
                    curveTo(5.3504f, 23.2003f, 5.2766f, 23.2256f, 5.2003f, 23.2395f)
                    curveTo(4.6888f, 23.3295f, 4.1983f, 22.8585f, 4.3003f, 22.2765f)
                    lineTo(5.5453f, 15.1815f)
                    lineTo(0.2623f, 10.1475f)
                    curveTo(0.1804f, 10.0697f, 0.1154f, 9.9759f, 0.0713f, 9.8719f)
                    curveTo(0.0272f, 9.7679f, 0.0049f, 9.6559f, 0.0058f, 9.543f)
                    curveTo(0.0061f, 9.3834f, 0.0497f, 9.2269f, 0.1318f, 9.09f)
                    curveTo(0.1909f, 8.9911f, 0.2714f, 8.9067f, 0.3675f, 8.8431f)
                    curveTo(0.4635f, 8.7795f, 0.5726f, 8.7383f, 0.6868f, 8.7225f)
                    lineTo(8.0338f, 7.6785f)
                    close()
                    moveTo(12.0028f, 18.0405f)
                    curveTo(12.1228f, 18.0405f, 12.2428f, 18.0675f, 12.3508f, 18.1245f)
                    lineTo(17.8798f, 20.9655f)
                    lineTo(16.8388f, 15.03f)
                    curveTo(16.8142f, 14.8934f, 16.8237f, 14.7528f, 16.8664f, 14.6207f)
                    curveTo(16.909f, 14.4886f, 16.9835f, 14.369f, 17.0833f, 14.2725f)
                    lineTo(21.4423f, 10.1175f)
                    lineTo(15.3643f, 9.2535f)
                    curveTo(15.2384f, 9.2345f, 15.119f, 9.1853f, 15.0164f, 9.11f)
                    curveTo(14.9137f, 9.0348f, 14.8308f, 8.9358f, 14.7748f, 8.8215f)
                    lineTo(12.0058f, 3.3345f)
                    lineTo(12.0028f, 3.339f)
                    verticalLineTo(18.039f)
                    verticalLineTo(18.0405f)
                    close()
                }
            }
        }
        .build()
        return `_star-half`!!
    }

private var `_star-half`: ImageVector? = null
