package com.github.xalvarez.introductiontokotlin.shape

class Square(base: Double) : Shape(base) {

    override fun getArea() = base * base
}