package com.example.selprojtestmaps

import androidx.compose.runtime.Composable
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.Polygon
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class Square(x: Int, y: Int) {
    private val x = x
    private val y = y
    private val lat_zero = 50.864730
    private val lon_zero = 3.804760
    private val size = 0.001

    fun getLeftTop(): LatLng {
        return LatLng(lat_zero + size * x, lon_zero + size * y)
    }

    fun getRightTop(): LatLng {
        return LatLng(lat_zero + size * x + size, lon_zero + size * y)
    }

    fun getLeftBottom(): LatLng {
        return LatLng(lat_zero + size * x, lon_zero + size * y + size)
    }

    fun getRightBottom(): LatLng {
        return LatLng(lat_zero + size * x + size, lon_zero + size * y + size)
    }

    @Composable
    fun getPoly() {
        return Polygon(
            points = mutableListOf(getLeftTop(), getRightTop(), getRightBottom(), getLeftBottom()),
            fillColor = Color(
                red = Random.nextFloat(),
                green = Random.nextFloat(),
                blue = Random.nextFloat(),
                alpha = 0.2f
            ),
            strokeColor = Color(
                red = 0f,
                green = 0f,
                blue = 0f,
                alpha = 0.5f
            ),
            strokeWidth =2f
        )
    }

}
