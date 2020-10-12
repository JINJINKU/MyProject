package part01

import java.util.Date as UtilDate
fun main(args:Array<String>) {

    val str = "Hello Kotlin"

    println("str : $str"+"1")
    println("str : $str"+"2")

    val list : ArrayList<String> = arrayListOf()

    list.add("one")
    list.add("two")
    list.add("three")
    list.add("four")

    for (str in list) {
        println("list  : $str")
    }

    println()
    val date = UtilDate()

    println("date : $date")
}

// kotlin에서는 물리적 위치가 아닌 곳으로 package를 만들 수 있다. 가상 패키지를 설정 할 수 있다.( 나중에 패키지를 만들 수 있다)