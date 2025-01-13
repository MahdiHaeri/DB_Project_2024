package org.example.db_project_2024.controller

import org.springframework.web.bind.annotation.*

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
    fun getAccount(@PathVariable id: String): String {
        // TODO: Implement
        return "getAccount"
    }
}