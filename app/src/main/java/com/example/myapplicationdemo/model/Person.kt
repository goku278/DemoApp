package com.example.myapplicationdemo.model

class Person {
    var id: Long = 0L
    var name: String? = null
    var age: Long? = null
    var city: String? = null

    override fun toString(): String {
        return "Person(id=$id, name=$name, age=$age, city=$city)"
    }
}