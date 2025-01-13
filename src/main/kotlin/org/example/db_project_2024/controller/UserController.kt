package org.example.db_project_2024.controller

import org.apache.catalina.filters.AddDefaultCharsetFilter.ResponseWrapper
import org.example.db_project_2024.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/users")
class UserController (
    private val userService: UserService
) {
    @GetMapping("/whoami")
    fun getUserDetails(): String {
        return userService.getUserDetails()
    }

    @GetMapping("")
    fun getUsers(): String {
        // TODO: Implement
        return "getUsers"
    }

    @GetMapping("/{id}")
    fun getUser(): String {
        // TODO: Implement
        return "getUser"
    }


    @GetMapping("/{id}")
    fun updateUser(): String {
        // TODO: Implement
        return "updateUser"
    }
}