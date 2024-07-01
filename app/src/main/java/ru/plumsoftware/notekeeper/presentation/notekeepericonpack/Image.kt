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

public val NotekeeperIconPack.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 26.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 26.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0029f, 3.0f)
                horizontalLineTo(3.0029f)
                curveTo(2.6051f, 3.0f, 2.2236f, 3.158f, 1.9423f, 3.4393f)
                curveTo(1.661f, 3.7206f, 1.5029f, 4.1022f, 1.5029f, 4.5f)
                verticalLineTo(18.0f)
                lineTo(5.4719f, 14.469f)
                curveTo(5.5945f, 14.3468f, 5.7556f, 14.2709f, 5.9278f, 14.2539f)
                curveTo(6.1001f, 14.237f, 6.2729f, 14.2801f, 6.4169f, 14.376f)
                lineTo(10.4069f, 17.0355f)
                lineTo(15.9719f, 11.4705f)
                curveTo(16.0832f, 11.3592f, 16.2266f, 11.2856f, 16.3819f, 11.2603f)
                curveTo(16.5373f, 11.235f, 16.6966f, 11.2592f, 16.8374f, 11.3295f)
                lineTo(22.5029f, 14.25f)
                verticalLineTo(4.5f)
                curveTo(22.5029f, 4.1022f, 22.3449f, 3.7206f, 22.0636f, 3.4393f)
                curveTo(21.7823f, 3.158f, 21.4008f, 3.0f, 21.0029f, 3.0f)
                close()
                moveTo(3.0029f, 1.5f)
                curveTo(2.2073f, 1.5f, 1.4442f, 1.8161f, 0.8816f, 2.3787f)
                curveTo(0.319f, 2.9413f, 0.0029f, 3.7043f, 0.0029f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(0.0029f, 20.2956f, 0.319f, 21.0587f, 0.8816f, 21.6213f)
                curveTo(1.4442f, 22.1839f, 2.2073f, 22.5f, 3.0029f, 22.5f)
                horizontalLineTo(21.0029f)
                curveTo(21.3969f, 22.5f, 21.787f, 22.4224f, 22.151f, 22.2716f)
                curveTo(22.515f, 22.1209f, 22.8457f, 21.8999f, 23.1243f, 21.6213f)
                curveTo(23.4028f, 21.3427f, 23.6238f, 21.012f, 23.7746f, 20.6481f)
                curveTo(23.9253f, 20.2841f, 24.0029f, 19.894f, 24.0029f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(24.0029f, 3.7043f, 23.6869f, 2.9413f, 23.1243f, 2.3787f)
                curveTo(22.5616f, 1.8161f, 21.7986f, 1.5f, 21.0029f, 1.5f)
                horizontalLineTo(3.0029f)
                close()
                moveTo(9.0029f, 8.25f)
                curveTo(9.0029f, 8.5455f, 8.9447f, 8.8381f, 8.8317f, 9.111f)
                curveTo(8.7186f, 9.384f, 8.5528f, 9.6321f, 8.3439f, 9.841f)
                curveTo(8.135f, 10.0499f, 7.887f, 10.2157f, 7.614f, 10.3287f)
                curveTo(7.341f, 10.4418f, 7.0484f, 10.5f, 6.7529f, 10.5f)
                curveTo(6.4575f, 10.5f, 6.1649f, 10.4418f, 5.8919f, 10.3287f)
                curveTo(5.6189f, 10.2157f, 5.3709f, 10.0499f, 5.1619f, 9.841f)
                curveTo(4.953f, 9.6321f, 4.7873f, 9.384f, 4.6742f, 9.111f)
                curveTo(4.5611f, 8.8381f, 4.5029f, 8.5455f, 4.5029f, 8.25f)
                curveTo(4.5029f, 7.6533f, 4.74f, 7.081f, 5.1619f, 6.659f)
                curveTo(5.5839f, 6.2371f, 6.1562f, 6.0f, 6.7529f, 6.0f)
                curveTo(7.3497f, 6.0f, 7.922f, 6.2371f, 8.3439f, 6.659f)
                curveTo(8.7659f, 7.081f, 9.0029f, 7.6533f, 9.0029f, 8.25f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
