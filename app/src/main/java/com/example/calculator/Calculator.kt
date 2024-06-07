package com.example.calculator

fun main() {
    println("첫번째 숫자를 입력해 주세요.")
    var num1 = readLine()!!.toInt()

    var operation = 0
    while(operation != -1) {
        println("${num1}에 계산할 숫자를 입력해 주세요.")
        var num2 = readLine()!!.toInt()

        println("원하는 계산을 선택하세요")
        println("1. 더하기  2. 빼기 3. 곱하기  4. 나누기  5. 나머지 구하기  -1. 종료")
        operation = readLine()!!.toInt()
        if(operation == -1) return println("종료합니다.")
        when(operation){
            1 -> num1 = AddOperation().operate(num1, num2)
            2 -> num1 = SubstractOperation().operate(num1, num2)
            3 -> num1 = MultiplyOperation().operate(num1, num2)
            4 -> num1 = DivideOperation().operate(num1, num2)
            -1 -> return println("종료합니다.")
            else -> return println("잘못 입력했습니다. 종료합니다.")
        }
        println(num1)
        println("계산 완료")
    }
}

open class Calculator {
    open fun operate(num1: Int, num2: Int): Int = 0
}

class AddOperation: Calculator() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

class SubstractOperation: Calculator() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

class MultiplyOperation: Calculator() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

class DivideOperation: Calculator() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}
