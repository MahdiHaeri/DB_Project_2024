package org.example.db_project_2024.controller

import org.example.db_project_2024.controller.response.ResponseWrapper
import org.example.db_project_2024.enums.ResponseStatusEnum
import org.example.db_project_2024.model.User
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
    fun getUsers(): ResponseWrapper<List<User>> {
        return ResponseWrapper(
            ResponseStatusEnum.OK,
            userService.getUsers()
        )
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String): String {
        // TODO: Implement
        return "hello"
    }


    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: String): String {
        // TODO: Implement
        return "updateUser"
    }
}