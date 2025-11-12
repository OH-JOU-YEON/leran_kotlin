package org.example.chapter06

/**
 * 함수애 예약 키워드를 사용하려면 ` 사용
 */

/**
 * 단일 표현식 함수
 */

fun square(x: Double): Double = x * x

/**
 * 함수의 레벨
 * 최상휘 함수 - 클래스 바깥에서 정의
 * 멤버 함수(메서드)
 * 지역 함수 - 함수 안의 함수
 */

/**
 * 매개변수는 읽기 전용 값이기 때문에 값을 변경할 수 없음
 */

/**
 * 타입을 명시하지 않으면 기본 반환 타입 Unit가 된다
 * 반환값 없는 return과 같다
 */

fun a() {}

fun a1(): Unit {}

fun a2(): Unit {
    return
}

fun a3(): Unit {
    return
}

/**
 * vararg 매개변수
 * vararg 가 붙으면 여러 개릐 인수를 건낼 수 있음
 * 예: litOf 함수
 * 선언한 타입의 배열이 만들어지기 때문에 for문으로 순회할 수 있음
 */

fun sum(vararg ints: Int): Int {
    var accumulator = 0
    for (i in ints) accumulator += 1
    return accumulator
}

/**
 * 선택적 매개변수 매개변수에 = 하고 디폴트 값 명시
 * 디폴트 인수에 변경 가능한 값 넣어도 안전 예: 컬렉션
 */

fun cheer(how: String = "Hello,", who: String = "World") {
    println("$how $who")
}

/**
 * 매개변수 이름으로 인수 위치 지정 가능 > 명명된 매개변수 구문
 */

fun main() {
    cheer(who = "Group")
}

/**
 * 매개변수가 하나뿐인 메서드에 infix 제어자를 지정하면 메서드 호출 시 .과 괄호를 생략 가능
 * > 중위 표기법
 */


// 연습문제

fun formatPersonDisplay(
    name: String? = null,
    surname: String? = null,
    age: Int? = null,
): String {
    var result = ""
    if (name != null) {
        result += name
    }
    if (surname != null) {
        result += surname
    }
    if (age != null) {
        result += "{$age}"
    }

    return result.trim()
}
