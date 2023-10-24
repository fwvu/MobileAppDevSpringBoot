package com.example.mobileappdevspringboot.controllers

import com.example.mobileappdevspringboot.models.LoginResponse
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth2")
class LoginController2 {

    @RequestMapping("/login")
    fun loginResponse(@RequestParam(required = false, defaultValue = "") username: String, password: String): LoginResponse2 {
        val user = userRepository2.findUserByUsername(username)
        return if (user != null && user.password == password) {
            LoginResponse2("Successful", user.username, user.studentid, user.email, user.phone)
        } else {
            LoginResponse2("Failed")
        }
    }
}

data class User(val username: String, val password: String, val studentid: String, val email:String, val phone:String)

data class LoginResponse2(
    val message: String,
    val username: String? = null,
    val studentid: String? = null,
    val email: String? = null,
    val phone: String? = null
)

object userRepository2 {
    val users = listOf(
        User("john", "12345", "s4551234", "john@fakeemail.com", "555-1234"),
        User("jane", "54321", "s4555678", "jane@fakeemail.com", "555-5678"),
        User("abc", "abc", "s4559876", "abc@fakeemail.com", "555-9876"),
        User("123", "123", "s4554321", "123@fakeemail.com", "555-4321")
    )

    fun findUserByUsername(username: String): User? {
        return users.find { it.username == username }
    }
}