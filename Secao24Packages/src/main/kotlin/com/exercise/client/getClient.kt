package com.exercise.client

import com.exercise.hello.sayHi

fun getClient() {
    val input = readLine() ?: "0"
    sayHi(input)
}