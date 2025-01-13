package org.example.db_project_2024.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/transactions")
class TransactionController (

) {
    @GetMapping("")
    fun getTransactions(): String {
        // TODO: Implement
        return "Hello"
    }

    @GetMapping("/{id}")
    fun getTransaction(): String {
        // TODO: Implement
        return "Hello"
    }

    @PostMapping("")
    fun createTransaction() {
        // TODO: Implement
    }
}