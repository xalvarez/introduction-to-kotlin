package com.github.xalvarez.introductiontokotlin.line

class LineService {

    fun newWithDoubleWeight(line: Line) = line.copy(weight = line.weight * 2)
}
