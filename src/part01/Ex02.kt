package part01

var x : Int = 100
    get(){
        println("ues x")
        return field
    }
    set(value) {
        if (value > 100) {
            println("$value is over 100")
            field = 100
        }else{
            println("$value is under 100")
            field = value
        }
    }

fun main(args:Array<String>) {

    x = 200
    println(x)

}

// Function : 전역에 만들어 짐
// Method : Class 안에 만들어서 인스턴스를 이용해 접근
// 함수를 선언(생성)

// 함술를 실행(생성)