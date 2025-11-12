package org.example.chapter04

/**
 *코틀린 기본 타입 / 리터럴
 * 수(Int, Long, Double, Float, Short, Byte)
 * boolean
 * char
 * String
 */

/**
 * 코틀린은 모든 값이 객체로 생각됨. 원시타입 없음
 * 모든 값을 메서드를 제공
 * 값의 타입을 제네릭 타입 인수로 사용할 수도 있음
 * 컴파일러는 원시 타입을 사용할 수도 있지만 사용자에게 영향을 주지 않음.
 */

/**
 * 코틀린은 암묵적 타입 변환을 지원하지 않음
 * 수의 타입을 명시적으로 변환하려면 toInt 같은 명시적 변환 함수 사용
 */

fun main() {
    val b: Byte = 123
    val l: Long = 123L
    val i: Int = 123

    val i1: Int = b.toInt()
    val i2: Int = l.toInt()
    val l1: Long = b.toLong()
    val l2: Long = i.toLong()
}

/**
 * 수 리터럴의 자릿수 사이에 _을 넣을 수 있음
 */

fun main2() {
    val million = 1_000_000
    println(million)
}

/**
 * 수를 16진수로 지원하려면 0x_로 시작
 * 8진수는 지원하지 않음
 */

fun main3() {
    val hexBytes = 0xA4_D6_FE_FE
    println(hexBytes)
    val bytes = 0b0111111111111
    println(bytes)
}


/**
 * 숫자를 나타내는 모든 기본 타입은 Number의 서브타입
 * Number타입에는 값을 다른 기본 타입으로 바꿔 주는 변환 함수들이 정의돼 있음
 */


fun main4() {
    val b: Byte = 123
    val l: Long = b.toLong()
    val f: Float = l.toFloat()
    val i: Int = f.toInt()
    val d: Double = i.toDouble()
    println(d)
}

/**
 * 기본적인 수 연산 제공
 * 정수를 부동소수점 수로 변환한 뒤에 나누면 값이 정확하게 나옴
 */

fun main5() {
    println(5.toDouble() / 2)
}

/**
 * 코틀린 비트 연산
 * and
 * or
 * xor
 * shl
 * shr
 */

/**
 *크기 제한 없는 정수: BigInteger
 * 크기 제한 없는 부동소수점 수 BigDecimal
 * 외부 라이브러리 아닌 기본 제공
 */

/**
 * 불 타입 기본 제공
 * 논리 연산자
 * &&
 * ||
 * !
 * 논리 연산자들은 불 타입 값들만 사용 가능
 */

fun main6() {
    val b1: Boolean = true
    val b2: Boolean = false
}



