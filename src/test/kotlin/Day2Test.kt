package com.github.jaguililla.aoc23

import com.github.jaguililla.aoc23.Helper.resourceText
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day2Test {

    @Test fun `Part 1 example works`() {
        val input =
            """
            Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
            Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
            Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
            Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
            Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
            """
            .trimIndent()

        assertEquals(8, day2Part1(input, 12, 13, 14))
    }

    @Test fun `Part 1 input works`() {
        val input = resourceText("/day2.txt")

        assertEquals(2237, day2Part1(input, 12, 13, 14))
    }

    @Test fun `Part 2 example works`() {
        val input =
            """
            Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
            Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
            Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
            Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
            Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
            """
            .trimIndent()

        assertEquals(2286, day2Part2(input))
    }

    @Test fun `Part 2 input works`() {
        val input = resourceText("/day2.txt")

        assertEquals(66681, day2Part2(input))
    }
}
