package org.example.chapter10

/**
 * 상속
 *
 * open키워드로 상속 가능하게 해 줘야 함
 *
 * 상속 > 주 생성자 뒤에 콜론 붙이고 슈퍼 클래스 생성자 호출
 */


open class Mammal {
    val haveHairOrFur = true
    val warmBlooded = true
    var canFeed = false

    fun feedYoung() {
        if (canFeed) {
            println("포유류입니다.")
        }
    }
}

class Dog : Mammal() {
    fun makeVoice() {
        println("멍 멍")
    }
}

fun main() {
    val dog = Dog()
    dog.makeVoice()
    println(dog.haveHairOrFur)
    println(dog.warmBlooded)

    //업캐스팅 가능
    val mammal: Mammal = dog
    mammal.canFeed = true
    mammal.feedYoung()
}

/**
 * 오버라이딩 시 override 제어자
 */

/**
 * 인터페이스
 *
 * 키워드, 이름, 구현할 프로퍼티와 메서드로 이루어진 본문
 */


/**
 * 가시성
 *
 * 클래스 멤버용 가시성
 *
 * public
 * private
 * protected > 클래스와 서브클래스에서만 볼 수 있음
 * internal > 선언된 클래스를 볼 수 있는 클라이언트를 포함하는 모드 모듈 내부에서 볼 수 있음
 */


/**
 * 최상위 요소용 가시성 제어자
 *
 * public
 * private > 같은 파일 내에서만 볼 수 있음
 * internal > 같은 모듈 내에서만 볼 수 있음
 *
 * 코틀린의 모듈 > 함께 컴파일되는 코틀린 소스 덩어리
 *
 * 그레들의 소스셋
 * 메이븐의 프로젝트
 * 인텔리제이 모듈
 * 앤트 태스크 하나를 호출하여 컴파일 된 파일들
 */

// 연습문제

open class View(id: String, isVisible: Boolean) {

    val id = id
    var isVisible = isVisible

    fun show() {
        this.isVisible = true
    }

    fun hide() {
        this.isVisible = false
    }
}

class TextView(
    id: String,
    var text: String
) : View(id, true)

class Toggle(
    id: String,
) : View(id, true) {
    var isOn: Boolean = false

    fun click() {
        isOn = !isOn
    }
}

