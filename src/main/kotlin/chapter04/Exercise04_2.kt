package org.example.chapter04

/**
 * 하나의 문자 Char
 */

fun main7() {
    println('A')
}

/**
 * 문자를 유니코드로 표현 가능
 */

fun main8() {
    println('\u00A3')
}

/**
 * " 또는 """로 문자열 정의
 */

fun main9() {
    val text1 = "ABC"
    println(text1)
    // 여러 줄의 문자열
    val text2 = """DEF""".trimIndent()
    println(text2)
}

/**
 * 템플릿 표현식 사용 가능
 */

fun main10() {
    val text1 = """abc\ndef"""
    println(text1)

    val text2 = """abc${"\n"}def"""
    println(text2)
}


