package ru.plumsoftware.notekeeper.presentation.notekeepericonpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.plumsoftware.notekeeper.presentation.NotekeeperIconPack

public val NotekeeperIconPack.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = Builder(name = "Clock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 22.5f)
                    curveTo(14.7848f, 22.5f, 17.4555f, 21.3938f, 19.4246f, 19.4246f)
                    curveTo(21.3938f, 17.4555f, 22.5f, 14.7848f, 22.5f, 12.0f)
                    curveTo(22.5f, 9.2152f, 21.3938f, 6.5445f, 19.4246f, 4.5754f)
                    curveTo(17.4555f, 2.6063f, 14.7848f, 1.5f, 12.0f, 1.5f)
                    curveTo(9.2152f, 1.5f, 6.5445f, 2.6063f, 4.5754f, 4.5754f)
                    curveTo(2.6063f, 6.5445f, 1.5f, 9.2152f, 1.5f, 12.0f)
                    curveTo(1.5f, 14.7848f, 2.6063f, 17.4555f, 4.5754f, 19.4246f)
                    curveTo(6.5445f, 21.3938f, 9.2152f, 22.5f, 12.0f, 22.5f)
                    close()
                    moveTo(24.0f, 12.0f)
                    curveTo(24.0f, 15.1826f, 22.7357f, 18.2348f, 20.4853f, 20.4853f)
                    curveTo(18.2348f, 22.7357f, 15.1826f, 24.0f, 12.0f, 24.0f)
                    curveTo(8.8174f, 24.0f, 5.7652f, 22.7357f, 3.5147f, 20.4853f)
                    curveTo(1.2643f, 18.2348f, 0.0f, 15.1826f, 0.0f, 12.0f)
                    curveTo(0.0f, 8.8174f, 1.2643f, 5.7652f, 3.5147f, 3.5147f)
                    curveTo(5.7652f, 1.2643f, 8.8174f, 0.0f, 12.0f, 0.0f)
                    curveTo(15.1826f, 0.0f, 18.2348f, 1.2643f, 20.4853f, 3.5147f)
                    curveTo(22.7357f, 5.7652f, 24.0f, 8.8174f, 24.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.25f, 4.5f)
                    curveTo(11.4489f, 4.5f, 11.6397f, 4.579f, 11.7803f, 4.7197f)
                    curveTo(11.921f, 4.8603f, 12.0f, 5.0511f, 12.0f, 5.25f)
                    verticalLineTo(13.065f)
                    lineTo(16.872f, 15.849f)
                    curveTo(17.0397f, 15.9502f, 17.1612f, 16.1129f, 17.2104f, 16.3024f)
                    curveTo(17.2597f, 16.492f, 17.2329f, 16.6933f, 17.1358f, 16.8633f)
                    curveTo(17.0386f, 17.0333f, 16.8788f, 17.1586f, 16.6905f, 17.2124f)
                    curveTo(16.5022f, 17.2661f, 16.3003f, 17.2441f, 16.128f, 17.151f)
                    lineTo(10.878f, 14.151f)
                    curveTo(10.7632f, 14.0854f, 10.6678f, 13.9907f, 10.6014f, 13.8764f)
                    curveTo(10.535f, 13.762f, 10.5f, 13.6322f, 10.5f, 13.5f)
                    verticalLineTo(5.25f)
                    curveTo(10.5f, 5.0511f, 10.579f, 4.8603f, 10.7197f, 4.7197f)
                    curveTo(10.8603f, 4.579f, 11.0511f, 4.5f, 11.25f, 4.5f)
                    close()
                }
            }
        }
        .build()
        return _clock!!
    }

private var _clock: ImageVector? = null
