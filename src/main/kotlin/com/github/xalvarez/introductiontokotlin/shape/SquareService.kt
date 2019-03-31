package com.github.xalvarez.introductiontokotlin.shape

class SquareService {

    fun getAreaWithNonNullableSquare(square: Square) = square.base * square.base

    fun getAreaWithNullableSquare(square: Square?): Double {
        val base: Double = square?.base ?: 0.0
        return base * base
    }
}