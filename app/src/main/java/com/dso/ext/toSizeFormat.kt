package com.dso.ext
import kotlin.math.log10
import kotlin.math.pow

fun Long.toSizeFormat(): String {
    val unit = 1024
    if (this < unit) {
        return "$this B"
    }
    val exp = (log10(this.toDouble()) / log10(unit.toDouble())).toInt()
    val pre = "KMGTPE"[exp - 1]
    return "%.2f %sB".format(this / unit.toDouble().pow(exp.toDouble()), pre)
}
