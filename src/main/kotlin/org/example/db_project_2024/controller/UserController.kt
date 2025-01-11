package org.example.db_project_2024.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/users")
class UserController (

) {
    @GetMapping("/whoami")
    fun getUserDetails(): String {
        return "Hello World"
    }
}