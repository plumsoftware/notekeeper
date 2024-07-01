package ru.plumsoftware.notekeeper.presentation.notekeepericonpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val NotekeeperIconPack.MenuIcon: ImageVector
    get() {
        if (_menuIcon != null) {
            return _menuIcon!!
        }
        _menuIcon = Builder(name = "MenuIcon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 2.0f)
                    lineTo(10.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 4.0f)
                    lineTo(12.0f, 4.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 6.0f)
                    lineTo(2.0f, 6.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                    lineTo(0.0f, 4.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 10.0f)
                    lineTo(22.0f, 10.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 12.0f)
                    lineTo(24.0f, 12.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 14.0f)
                    lineTo(2.0f, 14.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 12.0f)
                    lineTo(0.0f, 12.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 18.0f)
                    lineTo(22.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 20.0f)
                    lineTo(24.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 22.0f)
                    lineTo(14.0f, 22.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 20.0f)
                    lineTo(12.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _menuIcon!!
    }

private var _menuIcon: ImageVector? = null
