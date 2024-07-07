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

public val NotekeeperIconPack.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 1.5f)
                    curveTo(0.0f, 1.1022f, 0.158f, 0.7206f, 0.4393f, 0.4393f)
                    curveTo(0.7206f, 0.158f, 1.1022f, 0.0f, 1.5f, 0.0f)
                    lineTo(22.5f, 0.0f)
                    curveTo(22.8978f, 0.0f, 23.2794f, 0.158f, 23.5607f, 0.4393f)
                    curveTo(23.842f, 0.7206f, 24.0f, 1.1022f, 24.0f, 1.5f)
                    verticalLineTo(22.5f)
                    curveTo(24.0f, 22.8978f, 23.842f, 23.2794f, 23.5607f, 23.5607f)
                    curveTo(23.2794f, 23.842f, 22.8978f, 24.0f, 22.5f, 24.0f)
                    horizontalLineTo(1.5f)
                    curveTo(1.1022f, 24.0f, 0.7206f, 23.842f, 0.4393f, 23.5607f)
                    curveTo(0.158f, 23.2794f, 0.0f, 22.8978f, 0.0f, 22.5f)
                    verticalLineTo(1.5f)
                    close()
                    moveTo(6.0f, 1.5f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(1.5f)
                    close()
                    moveTo(18.0f, 13.5f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(22.5f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(13.5f)
                    close()
                    moveTo(1.5f, 1.5f)
                    horizontalLineTo(4.5f)
                    verticalLineTo(4.5f)
                    horizontalLineTo(1.5f)
                    verticalLineTo(1.5f)
                    close()
                    moveTo(4.5f, 6.0f)
                    horizontalLineTo(1.5f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(4.5f)
                    verticalLineTo(6.0f)
                    close()
                    moveTo(1.5f, 10.5f)
                    horizontalLineTo(4.5f)
                    verticalLineTo(13.5f)
                    horizontalLineTo(1.5f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(4.5f, 15.0f)
                    horizontalLineTo(1.5f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(4.5f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(1.5f, 19.5f)
                    horizontalLineTo(4.5f)
                    verticalLineTo(22.5f)
                    horizontalLineTo(1.5f)
                    verticalLineTo(19.5f)
                    close()
                    moveTo(22.5f, 1.5f)
                    horizontalLineTo(19.5f)
                    verticalLineTo(4.5f)
                    horizontalLineTo(22.5f)
                    verticalLineTo(1.5f)
                    close()
                    moveTo(19.5f, 6.0f)
                    horizontalLineTo(22.5f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(19.5f)
                    verticalLineTo(6.0f)
                    close()
                    moveTo(22.5f, 10.5f)
                    horizontalLineTo(19.5f)
                    verticalLineTo(13.5f)
                    horizontalLineTo(22.5f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(19.5f, 15.0f)
                    horizontalLineTo(22.5f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(19.5f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(22.5f, 19.5f)
                    horizontalLineTo(19.5f)
                    verticalLineTo(22.5f)
                    horizontalLineTo(22.5f)
                    verticalLineTo(19.5f)
                    close()
                }
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
