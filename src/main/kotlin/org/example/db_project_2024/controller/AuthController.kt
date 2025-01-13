package org.example.db_project_2024.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/auth")
class AuthController (

) {
    @PostMapping("/login")
    fun login() {
        // TODO: Implement
    }

    @PostMapping("/signup")
    fun signUp() {
        // TODO: Implement
    }
}