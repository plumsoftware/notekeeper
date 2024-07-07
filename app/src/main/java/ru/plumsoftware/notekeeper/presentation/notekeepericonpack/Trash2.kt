package ru.plumsoftware.notekeeper.presentation.notekeepericonpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.plumsoftware.notekeeper.presentation.NotekeeperIconPack

public val NotekeeperIconPack.Trash2: ImageVector
    get() {
        if (_trash2 != null) {
            return _trash2!!
        }
        _trash2 = Builder(name = "Trash2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.77f, 6.0f)
                lineTo(7.062f, 19.746f)
                curveTo(7.1202f, 20.0963f, 7.3008f, 20.4145f, 7.5716f, 20.6441f)
                curveTo(7.8425f, 20.8737f, 8.1859f, 20.9998f, 8.541f, 21.0f)
                horizontalLineTo(15.459f)
                curveTo(15.8141f, 20.9998f, 16.1575f, 20.8737f, 16.4284f, 20.6441f)
                curveTo(16.6992f, 20.4145f, 16.8798f, 20.0963f, 16.938f, 19.746f)
                lineTo(19.23f, 6.0f)
                horizontalLineTo(4.77f)
                close()
                moveTo(5.5815f, 19.9935f)
                curveTo(5.6983f, 20.694f, 6.0599f, 21.3303f, 6.6018f, 21.7893f)
                curveTo(7.1437f, 22.2482f, 7.8308f, 22.5001f, 8.541f, 22.5f)
                horizontalLineTo(15.459f)
                curveTo(16.1692f, 22.5001f, 16.8563f, 22.2482f, 17.3982f, 21.7893f)
                curveTo(17.9402f, 21.3303f, 18.3017f, 20.694f, 18.4185f, 19.9935f)
                lineTo(21.0f, 4.5f)
                horizontalLineTo(3.0f)
                lineTo(5.5815f, 19.9935f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.5f)
                curveTo(21.0f, 6.1575f, 16.971f, 7.5f, 12.0f, 7.5f)
                curveTo(7.029f, 7.5f, 3.0f, 6.1575f, 3.0f, 4.5f)
                curveTo(3.0f, 2.8425f, 7.029f, 1.5f, 12.0f, 1.5f)
                curveTo(16.971f, 1.5f, 21.0f, 2.8425f, 21.0f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.35f, 4.5f)
                curveTo(19.08f, 4.29f, 18.6045f, 4.0395f, 17.889f, 3.801f)
                curveTo(16.4505f, 3.321f, 14.37f, 3.0f, 12.0f, 3.0f)
                curveTo(9.63f, 3.0f, 7.548f, 3.3225f, 6.111f, 3.801f)
                curveTo(5.3955f, 4.041f, 4.9185f, 4.2915f, 4.6485f, 4.5f)
                curveTo(4.9185f, 4.71f, 5.3955f, 4.9605f, 6.111f, 5.199f)
                curveTo(7.548f, 5.679f, 9.63f, 6.0f, 12.0f, 6.0f)
                curveTo(14.37f, 6.0f, 16.4505f, 5.6775f, 17.889f, 5.199f)
                curveTo(18.6045f, 4.959f, 19.0815f, 4.7085f, 19.3515f, 4.5f)
                horizontalLineTo(19.35f)
                close()
                moveTo(12.0f, 7.5f)
                curveTo(16.971f, 7.5f, 21.0f, 6.1575f, 21.0f, 4.5f)
                curveTo(21.0f, 2.8425f, 16.971f, 1.5f, 12.0f, 1.5f)
                curveTo(7.029f, 1.5f, 3.0f, 2.8425f, 3.0f, 4.5f)
                curveTo(3.0f, 6.1575f, 7.029f, 7.5f, 12.0f, 7.5f)
                close()
            }
        }
        .build()
        return _trash2!!
    }

private var _trash2: ImageVector? = null
