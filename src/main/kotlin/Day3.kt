package com.github.jaguililla.aoc23

/**
 * The engine schematic (your puzzle input) consists of a visual representation of the engine. There
 * are lots of numbers and symbols you don't really understand, but apparently any number adjacent
 * to a symbol, even diagonally, is a "part number" and should be included in your sum. (Periods (.)
 * do not count as a symbol.)
 *
 * Here is an example engine schematic:
 *
 * ```text
 * 467..114..
 * ...*......
 * ..35..633.
 * ......#...
 * 617*......
 * .....+.58.
 * ..592.....
 * ......755.
 * ...$.*....
 * .664.598..
 * ```
 *
 * In this schematic, two numbers are not part numbers because they are not adjacent to a symbol:
 * 114 (top right) and 58 (middle right). Every other number is adjacent to a symbol and so is a
 * part number; their sum is 4361.
 *
 * Of course, the actual engine schematic is much larger. What is the sum of all the part numbers in
 * the engine schematic?
 *
 * @param input Puzzle data.
 * @return Calculated result.
 */
fun day3(input: String): Int {
    return 0
}

data class EngineMap(val coords: Pair<Int, Int>)
data class EnginePart(val coords: Pair<Int, Int>)
data class EngineToken(val coords: Pair<Int, Int>)
