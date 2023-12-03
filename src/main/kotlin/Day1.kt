package com.github.jaguililla.aoc23

/**
 * [Day 1](https://adventofcode.com/2023/day/1)
 *
 * The newly-improved calibration document consists of lines of text; each line originally contained
 * a specific calibration value that the Elves now need to recover. On each line, the calibration
 * value can be found by combining the first digit and the last digit (in that order) to form a
 * single two-digit number.
 *
 * For example:
 *
 * ```text
 * 1abc2
 * pqr3stu8vwx
 * a1b2c3d4e5f
 * treb7uchet
 * ```
 *
 * In this example, the calibration values of these four lines are 12, 38, 15, and 77. Adding these
 * together produces 142.
 *
 * @param input Puzzle data.
 * @return Calculated result.
 */
fun day1Part1(input: String): Int =
    input
        .lines()
        .map(::line)
        .sum()

fun line(input: String): Int {
    val first = input.firstOrNull(Char::isDigit)?.let(Char::digitToInt) ?: 0
    val last = input.lastOrNull(Char::isDigit)?.let(Char::digitToInt) ?: 0

    return (first * 10) + last
}

/**
 * Your calculation isn't quite right. It looks like some of the digits are actually spelled out
 * with letters: one, two, three, four, five, six, seven, eight, and nine also count as valid
 * "digits".
 *
 * Equipped with this new information, you now need to find the real first and last digit on each
 * line. For example:
 *
 * ```text
 * two1nine
 * eightwothree
 * abcone2threexyz
 * xtwone3four
 * 4nineeightseven2
 * zoneight234
 * 7pqrstsixteen
 * ```
 *
 * In this example, the calibration values are 29, 83, 13, 24, 42, 14, and 76. Adding these together
 * produces 281.
 *
 * @param input Puzzle data.
 * @return Calculated result.
 */
fun day1Part2(input: String): Int =
    input
        .lines()
        .map(::linePart2)
        .sum()

val digits: Map<String, Int> = mapOf(
    "zero" to 0,
    "one" to 1,
    "two" to 2,
    "three" to 3,
    "four" to 4,
    "five" to 5,
    "six" to 6,
    "seven" to 7,
    "eight" to 8,
    "nine" to 9,

    "0" to 0,
    "1" to 1,
    "2" to 2,
    "3" to 3,
    "4" to 4,
    "5" to 5,
    "6" to 6,
    "7" to 7,
    "8" to 8,
    "9" to 9,
)

fun linePart2(input: String): Int {
    val first = digits[input.findAnyOf(digits.keys)?.second] ?: 0
    val last = digits[input.findLastAnyOf(digits.keys)?.second] ?: 0

    return (first * 10) + last
}
