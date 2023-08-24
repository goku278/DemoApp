package com.example.myapplicationdemo.utils

import com.example.myapplicationdemo.model.Person
import java.util.*

object PersonsListUtils {
    private var personList = ArrayList<Person>()

    fun addPersons(): ArrayList<Person> {
        var p = Person()
        p.id = 1;
        p.name = "Biswadeep"
        p.age = 22
        p.city = "Bangalore"

        personList.add(p)

        p = Person()

        p.id = 2;
        p.name = "Aditya"
        p.age = 22
        p.city = "Pune"
        personList.add(p)

        p = Person()

        p.id = 3
        p.name = "Rajesh"
        p.age = 25
        p.city = "Bangalore"
        personList.add(p)

        p = Person()

        p.id = 4
        p.name = "Sneha"
        p.age = 20
        p.city = "Bangalore"
        personList.add(p)

        p = Person()

        p.id = 5;
        p.name = "Raghav"
        p.age = 23
        p.city = "Delhi"
        personList.add(p)

        p = Person()

        p.id = 6
        p.name = "Biswadeep"
        p.age = 22
        p.city = "Bangalore"
        personList.add(p)

        p = Person()

        p.id = 7
        p.name = "Ratan Priya"
        p.age = 18
        p.city = "Gurgaon"
        personList.add(p)

        p = Person()

        p.id = 8
        p.name = "Aparna"
        p.age = 23
        p.city = "Kerela"
        personList.add(p)

        p = Person()

        p.id = 9
        p.name = "Rohit"
        p.age = 22
        p.city = "Bangalore"
        personList.add(p)

        p = Person()

        p.id = 10
        p.name = "Chetan"
        p.age = 19
        p.city = "Bangalore"
        personList.add(p)

        p = Person()

        p.id = 11
        p.name = "Jessica"
        p.age = 22
        p.city = "Delhi"
        personList.add(p)

        p = Person()

        p.id = 12
        p.name = "Sandeep"
        p.age = 25
        p.city = "Delhi"
        personList.add(p)

        p = Person()

        p.id = 13
        p.name = "Jayraj"
        p.age = 23
        p.city = "Silchar"
        personList.add(p)

        p = Person()

        p.id = 14
        p.name = "Abhik"
        p.age = 20
        p.city = "Guwahati"
        personList.add(p)

        p = Person()

        p.id = 15
        p.name = "Rajdeep"
        p.age = 22
        p.city = "Guwahati"
        personList.add(p)

        p = Person()

        p.id = 16
        p.name = "Partha"
        p.age = 22
        p.city = "Tezpur"
        personList.add(p)

        p = Person()

        p.id = 17
        p.name = "Satyam"
        p.age = 25
        p.city = "Jorhat"
        personList.add(p)

        p = Person()

        p.id = 18
        p.name = "Sophia"
        p.age = 30
        p.city = "Bangalore"
        personList.add(p)

        p = Person()

        p.id = 19
        p.name = "Ramkrishan"
        p.age = 22
        p.city = "Manipur"
        personList.add(p)

        p = Person()

        p.id = 20
        p.name = "Rawat"
        p.age = 25
        p.city = "Shillong"
        personList.add(p)

        p = Person()

        p.id = 21
        p.name = "Soumen"
        p.age = 25
        p.city = "Kolkata"
        personList.add(p)

        p = Person()

        p.id = 22
        p.name = "Sourav"
        p.age = 25
        p.city = "Kolkata"
        personList.add(p)

        p = Person()

        p.id = 23
        p.name = "Nihar"
        p.age = 25
        p.city = "Bangalore"
        personList.add(p)

        p = Person()

        p.id = 24
        p.name = "Aatif"
        p.age = 25
        p.city = "Bangalore"
        personList.add(p)

        p = Person()

        p.id = 25
        p.name = "Jagan"
        p.age = 25
        p.city = "Chennai"
        personList.add(p)

        p = Person()

        p.id = 26
        p.name = "Veera"
        p.age = 25
        p.city = "Pondicherry"
        personList.add(p)

        p = Person()

        p.id = 27
        p.name = "Edmina"
        p.age = 25
        p.city = "Karaikal"
        personList.add(p)

        p = Person()

        p.id = 28
        p.name = "Jagadeswari"
        p.age = 25
        p.city = "Shillong"
        personList.add(p)

        p = Person()

        p.id = 29
        p.name = "Mangai"
        p.age = 25
        p.city = "Shillong"
        personList.add(p)

        p = Person()

        p.id = 30
        p.name = "Dheeraj"
        p.age = 25
        p.city = "Shillong"
        personList.add(p)

        return personList;

    }

    fun validatePassword(password: String): Boolean {
        val regex = """^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{7}$""".toRegex()
        return regex.matches(password)
    }
}