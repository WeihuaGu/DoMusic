package com.dso.ext
fun <T> ArrayList<T>.averageAssignFixLength(length: Int): List<ArrayList<T>> {
    val result = mutableListOf<ArrayList<T>>()
    var currentIndex = 0

    while (currentIndex < this.size) {
        val sublist = ArrayList(this.subList(currentIndex, minOf(currentIndex + length, this.size)))
        result.add(sublist)
        currentIndex += length
    }

    return result
}
