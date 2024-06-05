package com.example.calculator

fun main() {
    println("첫번째 숫자를 입력해 주세요.")
    var num1 = readLine()!!.toInt()

    println("두번째 숫자를 입력해 주세요.")
    var num2 = readLine()!!.toInt()

    var operation = 0
    while(operation != -1) {
        println("원하는 계산을 선택하세요")
        println("1. 더하기  2. 빼기 3. 곱하기  4. 나누기  5. 나머지 구하기  -1. 종료")
        operation = readLine()!!.toInt()
        when(operation){
            1 -> num1 =Calculator().add(num1, num2)
            2 -> num1 =Calculator().subtract(num1, num2)
            3 -> num1 =Calculator().multiply(num1, num2)
            4 -> num1 =Calculator().divide(num1, num2)
            5 -> num1 = Calculator().mod(num1, num2)
            -1 -> return println("종료합니다.")
        }
        println(num1)
    }
}

class Calculator{

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }
    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }
    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }
    fun mod(num1: Int, num2: Int): Int{
        return num1 % num2
    }
}
