package com.github.jaguililla.aoc23

object Helper {

    fun resourceText(path: String): String {
        val resource = Helper::class.java.getResource(path)
        return resource?.readText() ?: error("Input not found")
    }
}
