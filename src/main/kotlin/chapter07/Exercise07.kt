package org.example.chapter07

/**
 * for문 형식
 * for (value in iterable) {
 *  println(value)
 *  }
 */

/**
 * 리스트나 세트를 순회 가능. 변수 타입 명시 가능
 */

fun main() {
    val list = listOf("A", "B", "C")
    for (letter in list) {
        print(letter)
    }

    for (str: String in setOf("E", "D", "C")) {
        print(str)
    }
}

/**
 * 매개변수가 없고, 결과 타입이 Iterator이고 operator 제어자가 필요한 iterator 메서드를 제공하는 객체
 * 순회 가능
 *  > Iterable 메서드 구현하는 등으로 조건 달성 가능
 */

/**
 * for문의 변수 타입은 Iterable 타입 인수로부터 추론된다.
 */

/**
 * 1..5 > 5를 포함하는 닫힌 범위
 * 1..<5 5를 포함하지 않는 열린 범위
 * until 중위 함수를 써도 ..<와 같은 결과
 */

fun main2() {
    for (i in 10 downTo 1 step 3) {
        print(1)
    }
}

/**
 * for문의 여러 방식
 */

// 1. indices 프로퍼티 활용

fun main3() {
    val names = listOf("A", "B", "C")

    for (i in names.indices) {
        val name = names[i]
        println("[$i] $name")
    }
}

// 2. 인덱스 된 값을 순회

fun main4() {
    val names = listOf("A", "B", "C")

    for ((i, name) in names.withIndex()) {
        val name = names[i]
        println("[$i] $name")
    }
}

// 연습문제

fun calculateSumOfSquare(n: Int): Int {
    var result: Int = 0
    for (i in 0..n) {
        result += i
    }
    return result
}

fun countDownByStep(
    start: Int,
    end: Int,
    step: Int,
): String {
    var result = ""
    for (i in start downTo end step step) {
        result += i.toString()
    }
    return result
}
