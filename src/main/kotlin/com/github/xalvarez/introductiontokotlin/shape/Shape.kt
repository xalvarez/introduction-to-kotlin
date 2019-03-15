package com.github.xalvarez.introductiontokotlin.shape

abstract class Shape(val base: Double, val height: Double = base, var beauty: Int = 5) {

    abstract fun getArea(): Double
}