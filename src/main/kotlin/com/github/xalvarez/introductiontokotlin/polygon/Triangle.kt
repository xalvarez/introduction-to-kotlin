package com.github.xalvarez.introductiontokotlin.polygon

class Triangle(base: Double, height: Double) : Polygon(base, height) {

    override fun getArea() = (base * height) / 2
}