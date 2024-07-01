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

public val NotekeeperIconPack.`Chevron-left-2`: ImageVector
    get() {
        if (`_chevron-left-2` != null) {
            return `_chevron-left-2`!!
        }
        `_chevron-left-2` = Builder(name = "Chevron-left-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF4C7BF0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0309f, 2.4689f)
                curveTo(17.1007f, 2.5385f, 17.1561f, 2.6213f, 17.1939f, 2.7124f)
                curveTo(17.2318f, 2.8035f, 17.2512f, 2.9012f, 17.2512f, 2.9999f)
                curveTo(17.2512f, 3.0985f, 17.2318f, 3.1962f, 17.1939f, 3.2873f)
                curveTo(17.1561f, 3.3784f, 17.1007f, 3.4612f, 17.0309f, 3.5309f)
                lineTo(8.5604f, 11.9999f)
                lineTo(17.0309f, 20.4689f)
                curveTo(17.1717f, 20.6097f, 17.2508f, 20.8007f, 17.2508f, 20.9999f)
                curveTo(17.2508f, 21.199f, 17.1717f, 21.39f, 17.0309f, 21.5309f)
                curveTo(16.89f, 21.6717f, 16.699f, 21.7508f, 16.4999f, 21.7508f)
                curveTo(16.3007f, 21.7508f, 16.1097f, 21.6717f, 15.9689f, 21.5309f)
                lineTo(6.9689f, 12.5309f)
                curveTo(6.899f, 12.4612f, 6.8436f, 12.3784f, 6.8058f, 12.2873f)
                curveTo(6.768f, 12.1962f, 6.7485f, 12.0985f, 6.7485f, 11.9999f)
                curveTo(6.7485f, 11.9012f, 6.768f, 11.8035f, 6.8058f, 11.7124f)
                curveTo(6.8436f, 11.6213f, 6.899f, 11.5385f, 6.9689f, 11.4689f)
                lineTo(15.9689f, 2.4689f)
                curveTo(16.0385f, 2.399f, 16.1213f, 2.3436f, 16.2124f, 2.3058f)
                curveTo(16.3035f, 2.268f, 16.4012f, 2.2485f, 16.4999f, 2.2485f)
                curveTo(16.5985f, 2.2485f, 16.6962f, 2.268f, 16.7873f, 2.3058f)
                curveTo(16.8784f, 2.3436f, 16.9612f, 2.399f, 17.0309f, 2.4689f)
                close()
            }
        }
        .build()
        return `_chevron-left-2`!!
    }

private var `_chevron-left-2`: ImageVector? = null
