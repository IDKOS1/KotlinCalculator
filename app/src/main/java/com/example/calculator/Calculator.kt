package com.example.calculator

fun main() {
    println("Lv4 version")
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
            2 -> num1 = SubtractOperation().operate(num1, num2)
            3 -> num1 = MultiplyOperation().operate(num1, num2)
            4 -> num1 = DivideOperation().operate(num1, num2)
            -1 -> return println("종료합니다.")
            else -> return println("잘못 입력했습니다. 종료합니다.")
        }
        println(num1)
        println("계산 완료")
    }
}

abstract class AbstractOperation {
    init {
        println("계산을 진행합니다...")
    }
    abstract fun operate(num1: Int, num2: Int): Int
}


class AddOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

class SubtractOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

class MultiplyOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

class DivideOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}
