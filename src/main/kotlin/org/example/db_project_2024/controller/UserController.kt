package org.example.db_project_2024.controller

import org.example.db_project_2024.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/users")
class UserController (
    private val userService: UserService
) {

    @GetMapping("")
    fun getUsers(): String {
        // TODO: Implement
        return "getUsers"
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String): String {
        // TODO: Implement
        return "getUser"
    }


    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: String): String {
        // TODO: Implement
        return "updateUser"
    }
}