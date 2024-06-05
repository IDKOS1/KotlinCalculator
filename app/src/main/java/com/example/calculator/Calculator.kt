package com.example.calculator

fun main() {
    println("첫번째 숫자를 입력해 주세요.")
    var num1 = readLine()!!.toInt()

    println("두번째 숫자를 입력해 주세요.")
    var num2 = readLine()!!.toInt()

    print("덧셈 결과: ")
    println(Calculator().add(num1, num2))
    print("뺄셈 결과: ")
    println(Calculator().subtract(num1, num2))
    print("곱셈 결과: ")
    println(Calculator().multiply(num1, num2))
    print("나눗셈 결과: ")
    println(Calculator().divide(num1, num2))
}

class Calculator {

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }
    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }
    fun divide(num1: Int, num2: Int): Double {
        return num1.toDouble() / num2.toDouble()
    }

}
