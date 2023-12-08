package homework

fun main(args: Array<String>) {

    var num1: Int = 1
    var num2: Int = 2
    var operator = '-'
    // 1+2 =3

    val calculator = Calculator2(num1, num2)

    val result = if(operator == '+') {
        calculator.add()
    } else if(operator == '-'){
        calculator.substract()
    } else if(operator == '*') {
        calculator. Multiplication()
    } else if(operator == '/') {
        calculator. division()
    }else {
        println("잘못된 연산자 입니다.")
    }

    println("$num1 $operator $num2 결과는 : $result 입니다")
}

class Calculator2(
    val num1: Int,
    val num2: Int
) {
    fun add(): Int {
        return num1 + num2
    }

    fun substract(): Int {
        return num1 - num2
    }

    fun Multiplication(): Int {
        return num1 * num2
    }

    fun division(): Int {
        return num1 / num2
    }
}