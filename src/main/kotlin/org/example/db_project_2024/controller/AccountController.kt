package org.example.db_project_2024.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/accounts")
class AccountController (

) {
    @GetMapping("")
    fun getAccounts(): String {
        // TODO: Implement
        return "getAccounts"
    }

    @GetMapping("/{id}")
    fun getAccount(): String {
        // TODO: Implement
        return "getAccount"
    }
}