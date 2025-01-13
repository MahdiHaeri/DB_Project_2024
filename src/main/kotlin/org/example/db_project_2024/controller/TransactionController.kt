package org.example.db_project_2024.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/transactions")
class TransactionController (

) {
    @GetMapping("")
    fun getTransactions(): String {
        // TODO: Implement
        return "getTransaction"
    }

    @GetMapping("/{id}")
    fun getTransaction(@PathVariable id: String): String {
        // TODO: Implement
        return "getTransaction"
    }

    @PostMapping("")
    fun createTransaction() {
        // TODO: Implement
    }
}