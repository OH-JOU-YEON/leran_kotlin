package org.example.chapter05

/**
 * 코틀린의 if else문은 표현식으로 사용될 수 있기 때문에 값을 생성할 수 있음
 */

fun main1() {
    val isOne = true
    val number1: Int = if (isOne) 1 else 0
    println(number1)

    val hasAccess: Boolean = if (isOne) {
        println("good morning")
        true
    } else {
        false
    }
    println(hasAccess)
}

/**
 * 삼항 연산자 대체
 */

fun main02() {
    val name = if (true) "" else println("true")
}

/**
 * if else if문은 존재하지 않음
 * if- else 문 중첩
 */

fun Any?.print() {
    print(this)
}

fun printNumberSign(num: Int) {
    if (num < 0) {
        "negative"
    } else if (num > 0) {
        "positive"
    } else {
        "zero"
    }.print()
}

fun main(args: Array<String>) {
    printNumberSign(-2)
    print(",")
    printNumberSign(0)
    print(",")
    printNumberSign(2)
}

/**
 * 중첩 됐기 때문에 첫번째 if문의 print는 작동하지 않는다
 * 조건이 여러 개면 when문을 사용하자
 */

fun printNumberSign2(num: Int) {
    when {
        num < 0 -> "negative"
        num > 0 -> "positive"
        else -> "zero"
    }.print()
}


/**
 * when문도 값을 반환할 수 있기 때문에 표현식으로 사용 가능
 * when뒤에 조건을 넣을 수 있다
 */

private val magicNumbers = listOf(7, 13)

fun describe(a: Any?) {
    when (a) {
        null -> println("nothing")
        1, 2, 3 -> println("small number")
        in magicNumbers -> println("Magic Number")
        in 4..100 -> println("Bing number")
        is String -> println("This is just $a")
        // is 연산자 > 값이 특정 타입인지 확인
        is Long, is Int -> println("This is Int or Long")
        else -> println("no idea")
    }
}

/**
 * 계층이 높은 타입을 낮은 타입으로 바꾸는 다운캐스팅 연산자 as
 */

fun main3() {
    var i: Number = 123
    val j = (i as Int) + 10
}

/**
 * as? 연산 불가능하면 null을 반환
 */


/**
 * 스마트 캐스팅 > 조건문을 통과하면 암묵적 형변환
 */

/**
 * while, do while문은 표현식으로 사용 불가능
 */


// 연습문제

//fun secondsToPrettyTime(second: Int): String {
//   val u = when {
//        (second < 0) -> "Invalid"
//        (second == 0) -> ""
//        (second > 0) -> {
//            val hour = (second / 60).toString()
//            val minute = ((second) / 3600).toString()
//            val sec = (second / (60 * 60 * 60)).toString()
//           "$hour 시 $minute 분 $sec 초"
//        }
//    }
//    }


//답

fun secondsPrettyTime(seconds: Int): String {
    if (seconds < 0) {
        return "Invalid Input"
    }

    val secondsInHour = 60 * 60
    val hours = seconds / secondsInHour
    val minutes = (seconds % secondsInHour) / 60
    val remainingSeconds = seconds % 60

    var result = ""
    if (hours > 0) {
        result += "$hours h"
    }
    if (minutes > 0) {
        result += "$minutes min"
    }
    if (remainingSeconds > 0) {
        result += "$remainingSeconds sec"
    }

    return result.trim()
}


