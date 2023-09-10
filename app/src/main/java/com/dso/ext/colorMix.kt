package com.dso.ext
import android.graphics.Color
fun Int.colorMix(vararg colors: Int): Int {
    val colorCount = colors.size
    var mixedColor = this

    for (color in colors) {
        val red = Color.red(color)
        val green = Color.green(color)
        val blue = Color.blue(color)

        val mixedRed = (Color.red(mixedColor) + red) / (colorCount + 1)
        val mixedGreen = (Color.green(mixedColor) + green) / (colorCount + 1)
        val mixedBlue = (Color.blue(mixedColor) + blue) / (colorCount + 1)

        mixedColor = Color.rgb(mixedRed, mixedGreen, mixedBlue)
    }

    return mixedColor
}
