package com.github.xalvarez.introductiontokotlin.polygon

class Square(base: Double) : Polygon(base) {

    override fun getArea() = base * base
}