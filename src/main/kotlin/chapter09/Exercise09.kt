package org.example.chapter09

/**
 * 클래스
 * new 키워드를 사용하지 않음
 */

class A

fun main1() {
    val a: A = A()
}


/**
 * 클래스 내부에 함수를 정의한다면 중괄호가 필요함
 */

/**
 * 프로퍼티 > 캡슐화가 자동으로 이루어지는 클래스 변수
 * 코틀린 내부의 모든 변수는 필드가 아닌 프로퍼티
 * 내부적으로 각각의 GETTER, SETTER가 만들어짐
 */

/**
 * 내부적 구현에 접근하고 싶을 경우 > 권장되지 않음
 */

//class User {
//    private var name: String = ""
//        get() = field.uppercase()
//        set(value) {
//            if (value.isNotBlank()) {
//                field = value
//            }
//        }
//
//    fun getName() = name
//}

/**
 * 커스텀 게터 > 프로퍼티 정의 후 get 키워드를 이어서 사용
 * field 키워드로 연결된 필드의 값을 참조할 수 있음
 *
 * 프로퍼티의 커스텀 접근자에서 field 키워드를 사용하면 필드가 생성되지 않음
 */


/**
 * 생성자
 * constructor 키워드
 *
 * 주 생성자 > 클래스 생성 시 클래스 이름 바로 다음에 정의되고, 매개변수로 프로퍼티 초기화
 *
 * 주 생성자는 하나만 존재. 나머지 부생성자들은 this 키워드를 사용해 주 생성자를 호출해야 함
 */

class User2(name: String, surname: String) {
    var name: String = ""
    var surname: String = ""
}


/**
 * 코틀린의 클래스 안에는 내부 클래스 정의가 가능하며, 기본적으로 서로 관계가 없음
 * inner 키워드를 사용해 내부 클래스임을 명시하면 내부 클래스의 객체를 만들 때 외부 클래스가 필요함
 */

// 연습문제

class Product(name: String, price: Double, quantity: Int) {
    var name = name
    var price = price
    var quantity = quantity
        set(quantity) {
            if (quantity < 0) {
                field = 0
            } else {
                field = quantity
            }
        }

    fun calculateTotalValue(): Double {
        return this.price * this.quantity
    }

    fun restock() {
        ++this.quantity
    }
}

fun main() {
    val laptop = Product("Laptop", 999.99, 5)

    println(laptop.name)
    println(laptop.quantity)
    println(laptop.calculateTotalValue())

    laptop.restock()

    println(laptop.quantity)
    println(laptop.calculateTotalValue())

    laptop.quantity = -2

    println(laptop.quantity)
    println(laptop.calculateTotalValue())

    laptop.quantity = 10

    println(laptop.quantity)
    println(laptop.calculateTotalValue())

}