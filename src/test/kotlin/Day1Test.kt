package com.github.jaguililla.aoc23

import com.github.jaguililla.aoc23.Helper.resourceText
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day1Test {

    @Test fun `Part 1 example works`() {
        val input =
            """
            1abc2
            pqr3stu8vwx
            a1b2c3d4e5f
            treb7uchet
            """
            .trimIndent()

        assertEquals(142, day1Part1(input))
    }

    @Test fun `Part 1 input works`() {
        val input = resourceText("/day1.txt")

        assertEquals(55621, day1Part1(input))
    }

    @Test fun `Part 2 example works`() {
        val input =
            """
            two1nine
            eightwothree
            abcone2threexyz
            xtwone3four
            4nineeightseven2
            zoneight234
            7pqrstsixteen
            """
            .trimIndent()

        assertEquals(281, day1Part2(input))
    }

    @Test fun `Part 2 input works`() {
        val input = resourceText("/day1.txt")

        assertEquals(53592, day1Part2(input))
    }
}
