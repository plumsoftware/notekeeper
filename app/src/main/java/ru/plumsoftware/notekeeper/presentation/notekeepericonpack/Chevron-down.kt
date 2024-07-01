package ru.plumsoftware.notekeeper.presentation.notekeepericonpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.plumsoftware.notekeeper.presentation.NotekeeperIconPack

public val NotekeeperIconPack.`Chevron-down`: ImageVector
    get() {
        if (`_chevron-down` != null) {
            return `_chevron-down`!!
        }
        `_chevron-down` = Builder(name = "Chevron-down", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.4689f, 6.9689f)
                curveTo(2.5385f, 6.899f, 2.6213f, 6.8436f, 2.7124f, 6.8058f)
                curveTo(2.8035f, 6.768f, 2.9012f, 6.7485f, 2.9999f, 6.7485f)
                curveTo(3.0985f, 6.7485f, 3.1962f, 6.768f, 3.2873f, 6.8058f)
                curveTo(3.3784f, 6.8436f, 3.4612f, 6.899f, 3.5309f, 6.9689f)
                lineTo(11.9999f, 15.4394f)
                lineTo(20.4689f, 6.9689f)
                curveTo(20.5386f, 6.8991f, 20.6214f, 6.8438f, 20.7125f, 6.8061f)
                curveTo(20.8036f, 6.7684f, 20.9013f, 6.7489f, 20.9999f, 6.7489f)
                curveTo(21.0985f, 6.7489f, 21.1961f, 6.7684f, 21.2873f, 6.8061f)
                curveTo(21.3784f, 6.8438f, 21.4611f, 6.8991f, 21.5309f, 6.9689f)
                curveTo(21.6006f, 7.0386f, 21.6559f, 7.1214f, 21.6937f, 7.2125f)
                curveTo(21.7314f, 7.3036f, 21.7508f, 7.4013f, 21.7508f, 7.4999f)
                curveTo(21.7508f, 7.5985f, 21.7314f, 7.6961f, 21.6937f, 7.7873f)
                curveTo(21.6559f, 7.8784f, 21.6006f, 7.9611f, 21.5309f, 8.0309f)
                lineTo(12.5309f, 17.0309f)
                curveTo(12.4612f, 17.1007f, 12.3784f, 17.1561f, 12.2873f, 17.1939f)
                curveTo(12.1962f, 17.2318f, 12.0985f, 17.2512f, 11.9999f, 17.2512f)
                curveTo(11.9012f, 17.2512f, 11.8035f, 17.2318f, 11.7124f, 17.1939f)
                curveTo(11.6213f, 17.1561f, 11.5385f, 17.1007f, 11.4689f, 17.0309f)
                lineTo(2.4689f, 8.0309f)
                curveTo(2.399f, 7.9612f, 2.3436f, 7.8784f, 2.3058f, 7.7873f)
                curveTo(2.268f, 7.6962f, 2.2485f, 7.5985f, 2.2485f, 7.4999f)
                curveTo(2.2485f, 7.4012f, 2.268f, 7.3035f, 2.3058f, 7.2124f)
                curveTo(2.3436f, 7.1213f, 2.399f, 7.0385f, 2.4689f, 6.9689f)
                close()
            }
        }
        .build()
        return `_chevron-down`!!
    }

private var `_chevron-down`: ImageVector? = null
