package com.github.xalvarez.introductiontokotlin.shape

class Triangle(base: Double, height: Double) : Shape(base, height) {

    override fun getArea() = (base * height) / 2
}