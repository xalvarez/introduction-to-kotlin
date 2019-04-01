package com.github.xalvarez.introductiontokotlin.line

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame

class LineServiceTest {

    private val lineService = LineService()

    @Test
    fun `Should create new line with double line weight`() {
        // Given
        val originalLine = Line(colour = "green", weight = 2.0)

        // When
        val newLine = lineService.newWithDoubleWeight(originalLine)

        // Then
        assertNotSame(newLine, originalLine)
        assertEquals(originalLine.weight * 2, newLine.weight)
    }

}

