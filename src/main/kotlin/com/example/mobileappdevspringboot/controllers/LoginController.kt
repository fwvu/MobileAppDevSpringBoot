package com.example.mobileappdevspringboot.controllers

import com.example.mobileappdevspringboot.models.LoginResponse
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class LoginController {

    @RequestMapping("/login") //localhost:8080/auth/login?username=bob&password=111
    fun loginResponse(@RequestParam(required = false, defaultValue = "") username: String, password: String): LoginResponse {
        return if (userRepository.usersAndPasswords.contains(username)) {
            if (userRepository.usersAndPasswords.get(username).equals(password)) LoginResponse("Successful") else LoginResponse("Failed")
        } else LoginResponse("Failed")
    }

}

object userRepository {
        val usersAndPasswords = hashMapOf("john" to "12345", "jane" to "54321", "abc" to "abc", "123" to "123")
}

