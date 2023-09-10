package com.dso.ext

/**
 * ArrayList 中上一项
 */
fun <T> ArrayList<T>.previous(current: T?): T? {
    if (this.isEmpty() || current == null) {
        return null
    }
    when (val position = this.indexOf(current)) {
        -1 -> return null
        0 -> {
            this[this.lastIndex]?.let {
                return it
            }
        }
        else -> {
            this[position - 1]?.let {
                return it
            }
        }
    }
    return null
}

/**
 * ArrayList 中下一项
 * 传入当前项 [current]，返回下一项（可能为空）
 */
fun <T> ArrayList<T>.next(current: T?): T? {
    if (this.isEmpty() || current == null) {
        return null
    }
    when (val position = this.indexOf(current)) {
        -1 -> return null
        this.lastIndex -> {
            this[0]?.let {
                return it
            }
        }
        else -> {
            this[position + 1]?.let {
                return it
            }
        }
    }
    return null
}
