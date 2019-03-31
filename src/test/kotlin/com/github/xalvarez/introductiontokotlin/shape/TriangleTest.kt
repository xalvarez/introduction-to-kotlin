package com.github.xalvarez.introductiontokotlin.shape

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TriangleTest {

    @Test
    fun `should calculate area`() {
        // Given
        val base = 2.0
        val height = 3.0
        val triangle = Triangle(base, height)

        // When
        val area = triangle.getArea()

        // Then
        assertEquals((base * height) / 2, area)
    }

    @Test
    fun `should get base`() {
        // Given
        val base = 2.0
        val height = 3.0
        val triangle = Triangle(base, height)

        // When
        val retrievedBase = triangle.base

        // Then
        assertEquals(retrievedBase, base)
    }

    @Test
    fun `should get height`() {
        // Given
        val base = 2.0
        val height = 3.0
        val triangle = Triangle(base, height)

        // When
        val retrievedHeight = triangle.height

        // Then
        assertEquals(retrievedHeight, height)
    }
}