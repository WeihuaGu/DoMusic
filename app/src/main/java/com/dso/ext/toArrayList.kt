package com.dso.ext
fun <T> List<T>.toArrayList(): ArrayList<T> {
    return ArrayList(this)
}
