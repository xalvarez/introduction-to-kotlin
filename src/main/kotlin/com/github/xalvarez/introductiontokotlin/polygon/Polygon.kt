package com.github.xalvarez.introductiontokotlin.polygon

abstract class Polygon(val base: Double, val height: Double = base, var beauty: Int = 5) {

    abstract fun getArea(): Double
}