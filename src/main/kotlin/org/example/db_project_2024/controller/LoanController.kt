package org.example.db_project_2024.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/loans")
class LoanController (

) {
    @GetMapping("")
    fun getLoans(): String {
        // TODO: Implement
        return "getLoans"
    }

    @GetMapping("/{id}")
    fun getLoan(): String {
        // TODO: Implement
        return "getLoan"
    }

    @PostMapping("")
    fun createLoan() {
        // TODO: Implement
    }
}