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

public val NotekeeperIconPack.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.2971f, 22.2749f)
                    curveTo(4.1801f, 22.9409f, 4.8371f, 23.4614f, 5.4161f, 23.1644f)
                    lineTo(12.0011f, 19.7804f)
                    lineTo(18.5846f, 23.1644f)
                    curveTo(19.1636f, 23.4614f, 19.8206f, 22.9409f, 19.7036f, 22.2764f)
                    lineTo(18.4586f, 15.1814f)
                    lineTo(23.7431f, 10.1474f)
                    curveTo(24.2366f, 9.6764f, 23.9801f, 8.8154f, 23.3186f, 8.7224f)
                    lineTo(15.9716f, 7.6784f)
                    lineTo(12.6956f, 1.1879f)
                    curveTo(12.6332f, 1.0563f, 12.5347f, 0.9452f, 12.4116f, 0.8673f)
                    curveTo(12.2886f, 0.7895f, 12.1459f, 0.7482f, 12.0003f, 0.7482f)
                    curveTo(11.8547f, 0.7482f, 11.7121f, 0.7895f, 11.589f, 0.8673f)
                    curveTo(11.4659f, 0.9452f, 11.3675f, 1.0563f, 11.3051f, 1.1879f)
                    lineTo(8.0291f, 7.6799f)
                    lineTo(0.6821f, 8.7239f)
                    curveTo(0.0206f, 8.8169f, -0.2359f, 9.6779f, 0.2576f, 10.1489f)
                    lineTo(5.5421f, 15.1829f)
                    lineTo(4.2971f, 22.2779f)
                    verticalLineTo(22.2749f)
                    close()
                    moveTo(11.6546f, 18.1244f)
                    lineTo(6.1256f, 20.9654f)
                    lineTo(7.1666f, 15.0299f)
                    curveTo(7.191f, 14.8933f, 7.1814f, 14.7527f, 7.1388f, 14.6207f)
                    curveTo(7.0961f, 14.4886f, 7.0217f, 14.369f, 6.9221f, 14.2724f)
                    lineTo(2.5631f, 10.1174f)
                    lineTo(8.6411f, 9.2534f)
                    curveTo(8.7669f, 9.2344f, 8.8863f, 9.1852f, 8.989f, 9.1099f)
                    curveTo(9.0916f, 9.0347f, 9.1745f, 8.9357f, 9.2306f, 8.8214f)
                    lineTo(12.0011f, 3.3344f)
                    lineTo(14.7701f, 8.8214f)
                    curveTo(14.8261f, 8.9357f, 14.909f, 9.0347f, 15.0117f, 9.1099f)
                    curveTo(15.1143f, 9.1852f, 15.2337f, 9.2344f, 15.3596f, 9.2534f)
                    lineTo(21.4376f, 10.1159f)
                    lineTo(17.0786f, 14.2709f)
                    curveTo(16.9786f, 14.3676f, 16.9039f, 14.4874f, 16.8613f, 14.6198f)
                    curveTo(16.8186f, 14.7522f, 16.8093f, 14.893f, 16.8341f, 15.0299f)
                    lineTo(17.8751f, 20.9654f)
                    lineTo(12.3461f, 18.1244f)
                    curveTo(12.2392f, 18.0693f, 12.1206f, 18.0405f, 12.0003f, 18.0405f)
                    curveTo(11.88f, 18.0405f, 11.7615f, 18.0693f, 11.6546f, 18.1244f)
                    close()
                }
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
