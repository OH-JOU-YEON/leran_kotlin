package org.example.chapter08

/**
 * 코틀린의 널 가능성
 * 1. 모든 프로퍼티에 값을 할당
 * 2. 일반 타입은 null 허용하지 않음
 * 3. 널 가능한 타입은 뒤에 ? 붙이기
 * 4. 널 가능 타입은 직접 사용 불가. 안전한 사용 또는 캐스팅
 */

/**
 * 코틀린의 null 처리법
 * 안전 호출
 * 널 아님 어설션
 * 스마트 캐스팅
 * 엘비스 연산자
 */

/**
 * 안전 호출
 * ?.으로 호출
 * 값이 null이면 아무것도 하지 않고 null 반환
 * 아니면 일반 호출처럼 작동
 */

class User(val name: String) {
    fun cheer() {
        println("hi $name")
    }
}

var user: User? = null

fun main() {
    user?.cheer()
    println(user?.name)
    user = User("Cookie")
    user?.cheer()
    println(user?.name)
}

/**
 * 안전 호출은 null에 대해 호출했을 때 null을 반환, 널 가능성은 전파될 수 있음
 * 위의 함수에서 user에 값이 명시적으로 할당되었더라도 user.name으로 호출 불가능
 */

/**
 * 널 아님 어설션
 * 값이 null이 아니어야 하면 null일때 예외를 던진다.
 * !!로 표현한다
 */

fun main2() {
    println(user!!.name.length)
    user = null
    println(user!!.name.length)
}

/**
 * null이 사용되는 경우가 없음을 보장하는 예외
 * requireNotNull
 * checkNoNull
 */

/**
 * 스마트 캐스팅
 * 널이 아님을 확신할 수 있는 스코프에서 널 가능 타입이 가능하지 않은 타입으로 캐스팅됨
 *
 * return 이나 throw에서도 스마트 캐스팅 적용
 *
 * 논리 표현식 && || 다음 값에도 적용
 *
 * 컨트랙트라는 기능 덕분
 *
 * 컨트랙트란?
 *
 * 컴파일러에게 함수의 동작에 대한 추가 정보를 제공하는 실험적 기능
 *함수가 어떤 조건에서 어떻게 동작하는지를 컴파일러에게 명시적으로 알려준다.
 *
 * 컴파일 타임에 실행되고, 코틀린의 제어흐름 분석에 추가적인 힌트를 제공한다.
 *
 *컴파일러는 컨트랙트의 구현만 검증하고, 실재 구현은 검증하지 않는다.
 */

fun printLengthIfNotNull(str: String?) {
    if (str != null) {
        println(str.length)
    }
}

/**
 * 엘비스 연산자
 *
 * 두 값 사이에 위치
 * 왼쪽의 값이 null이 아니면 연산 결과는 왼쪽의 null 가능한 값 그대로. 아니면 오른쪽 반환
 *
 * 널 가능한 값의 기본값을 제공하기 위해 사용 가능하다
 */

fun main3() {
    println("A")
}

/**
 * null 가능 타입의 확장 함수
 *
 * 문자열 기준
 *
 * orEmpty : 값이 null이 아니면 값을 그대로 반환
 * isNullOrEmpty : 값이 null이거나 비어있는 문자열이면 true를 반환 그렇지 않다면 false
 * isNullOrBlank : 값이 null이거나 공백이라면 true 아니면 false
 *
 * list용으로 위에 두 개 제공
 */

/**
 * 지연 초기화
 * 프로퍼티를 null이 불가능한 타입으로 정의하고 싶지만 객체를 생성하는 시점에 값을 명시하지 못하는 경우.
 *
 * lateinit
 *
 * 초기화되었는지 확인하는 기능 inInitialized 프로퍼티
 *
 *::객체.inInitialized
 */





