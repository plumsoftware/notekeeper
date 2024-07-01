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

public val NotekeeperIconPack.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.6612f, 15.6633f)
                    curveTo(15.8005f, 15.5239f, 15.9659f, 15.4132f, 16.148f, 15.3377f)
                    curveTo(16.3301f, 15.2622f, 16.5253f, 15.2234f, 16.7224f, 15.2234f)
                    curveTo(16.9195f, 15.2234f, 17.1147f, 15.2622f, 17.2968f, 15.3377f)
                    curveTo(17.4789f, 15.4132f, 17.6444f, 15.5239f, 17.7837f, 15.6633f)
                    lineTo(23.5587f, 21.4383f)
                    curveTo(23.8401f, 21.7196f, 23.9983f, 22.1011f, 23.9985f, 22.499f)
                    curveTo(23.9986f, 22.8969f, 23.8407f, 23.2786f, 23.5594f, 23.5601f)
                    curveTo(23.2782f, 23.8415f, 22.8966f, 23.9997f, 22.4987f, 23.9999f)
                    curveTo(22.1008f, 24.0f, 21.7191f, 23.8421f, 21.4377f, 23.5608f)
                    lineTo(15.6627f, 17.7858f)
                    curveTo(15.5232f, 17.6465f, 15.4126f, 17.4811f, 15.3371f, 17.299f)
                    curveTo(15.2616f, 17.1169f, 15.2227f, 16.9217f, 15.2227f, 16.7246f)
                    curveTo(15.2227f, 16.5274f, 15.2616f, 16.3323f, 15.3371f, 16.1502f)
                    curveTo(15.4126f, 15.9681f, 15.5232f, 15.8026f, 15.6627f, 15.6633f)
                    horizontalLineTo(15.6612f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.75f, 18.0f)
                    curveTo(10.8334f, 18.0f, 11.9062f, 17.7866f, 12.9071f, 17.372f)
                    curveTo(13.9081f, 16.9574f, 14.8175f, 16.3497f, 15.5836f, 15.5836f)
                    curveTo(16.3497f, 14.8175f, 16.9574f, 13.9081f, 17.372f, 12.9071f)
                    curveTo(17.7866f, 11.9062f, 18.0f, 10.8334f, 18.0f, 9.75f)
                    curveTo(18.0f, 8.6666f, 17.7866f, 7.5938f, 17.372f, 6.5929f)
                    curveTo(16.9574f, 5.5919f, 16.3497f, 4.6824f, 15.5836f, 3.9164f)
                    curveTo(14.8175f, 3.1503f, 13.9081f, 2.5426f, 12.9071f, 2.128f)
                    curveTo(11.9062f, 1.7134f, 10.8334f, 1.5f, 9.75f, 1.5f)
                    curveTo(7.562f, 1.5f, 5.4635f, 2.3692f, 3.9164f, 3.9164f)
                    curveTo(2.3692f, 5.4635f, 1.5f, 7.562f, 1.5f, 9.75f)
                    curveTo(1.5f, 11.938f, 2.3692f, 14.0365f, 3.9164f, 15.5836f)
                    curveTo(5.4635f, 17.1308f, 7.562f, 18.0f, 9.75f, 18.0f)
                    close()
                    moveTo(19.5f, 9.75f)
                    curveTo(19.5f, 12.3359f, 18.4728f, 14.8158f, 16.6443f, 16.6443f)
                    curveTo(14.8158f, 18.4728f, 12.3359f, 19.5f, 9.75f, 19.5f)
                    curveTo(7.1641f, 19.5f, 4.6842f, 18.4728f, 2.8557f, 16.6443f)
                    curveTo(1.0272f, 14.8158f, 0.0f, 12.3359f, 0.0f, 9.75f)
                    curveTo(0.0f, 7.1641f, 1.0272f, 4.6842f, 2.8557f, 2.8557f)
                    curveTo(4.6842f, 1.0272f, 7.1641f, 0.0f, 9.75f, 0.0f)
                    curveTo(12.3359f, 0.0f, 14.8158f, 1.0272f, 16.6443f, 2.8557f)
                    curveTo(18.4728f, 4.6842f, 19.5f, 7.1641f, 19.5f, 9.75f)
                    close()
                }
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
