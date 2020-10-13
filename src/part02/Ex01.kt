package part02

import java.sql.Time

fun func1() {
    println("Hello Kotlin")
}

fun func2(first: Int, second: Int): Int {
    return first + second
}

fun func3(first: Int, second: Int) = first + second

fun func4(msg: String = "no message", n: Int = 0) {
    println("msg : $msg , n : $n")
}

fun alarm(time: java.sql.Time, song: String = "default.mp3", repeat: Boolean = false) {
    println("지금 시각은 $time 입니다. ($song 시작)")

    while (repeat) {
        println("지금 시각은 $time 입니다. ($song 시작)")
    }
}

fun main() {
    func1()

    println(func2(50, 130))
    println(func3(16, 20))

    func4()
    val time = Time(30)
    alarm(time)

    val n1:Int = 10
    val n2:Double = 2.5

    var ret = n1 + n2

    println("ret : $ret")

}

//Int는 +-21억 그 이상은 Long
//Float 소수 6째 자리 Double은 소수 15째 자리까지 일반적으로 실수는 Double이 기준

//pull to refresh