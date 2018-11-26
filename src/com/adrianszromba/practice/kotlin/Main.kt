package com.adrianszromba.practice.kotlin

fun main(args: Array<String>) {
    println("Hello World")

    //declare variables (name before type)
    var x: Int = 10 //mutable
    var xx = 10 //in some context, type is optional
    val y: Int = 10 //immutable

    val point = Point() //instance of class
    println(point.x)
    println(point.y)

}