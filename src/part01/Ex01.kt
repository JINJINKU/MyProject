package part01

import java.util.Date as UtilDate
import java.util.*

    fun main(args:Array<String>) {

        val str = "Hello Kotlin"

        println("str : $str"+"1")
        println("str : $str"+"2")

        println()
        val date = UtilDate()

        println("date : $date")

        var x : Int = 200
        var y = 200

        var z : Int? = null

        var c : Int

//    val scanner = Scanner(System.`in`)
//    print("숫자를 입력하세요 : ")
//    var inputNumber = scanner.nextLine()
//
//    println("input Number : $inputNumber")
    }

// kotlin에서는 물리적 위치가 아닌 곳으로 package를 만들 수 있다. 가상 패키지를 설정 할 수 있다.( 나중에 패키지를 만들 수 있다)
// variable(변수) : 데이터 저장 공간에 붙인 이름
// val : 읽기 전용
// var : 읽기 쓰기 가능

//kotlin의 모든 자료형은 참조형 => value 타입이 없다?

//변수의 위치
//1) 클래스 외부에 생성 - 최상위 레벨의 변수 (Top - Level) - Property
//2) 클래스 내부에 생성 - Property => 변수와 getter, setter를 합쳐서 호칭 -> 생성은 변수처럼 하지만 사용할 때는 getter와 setter 메소드를 이용하는 것
//3) 함수 내부에 생성 - Local Variable => 변수 자체,

//var x : Int = 100
////    get{return 100}
////    set(k : Int){
////        field = k
////    }
//fun f() {
//    var y : Int = 100
//}

var n : Int? = null