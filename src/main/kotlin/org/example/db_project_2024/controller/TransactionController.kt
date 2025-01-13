package org.example.db_project_2024.controller

import org.example.db_project_2024.controller.response.ResponseWrapper
import org.example.db_project_2024.enums.ResponseStatusEnum
import org.example.db_project_2024.model.Transaction
import org.example.db_project_2024.service.TransactionService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/transactions")
class TransactionController(private val transactionService: TransactionService) {
    @GetMapping("")
    fun getTransactions(): ResponseWrapper<List<Transaction>> {
        return ResponseWrapper(
            ResponseStatusEnum.OK,
            transactionService.getTransactions()
        )
    }

    @GetMapping("/{id}")
    fun getTransaction(@PathVariable id: String): ResponseWrapper<Transaction?> {
        return ResponseWrapper(
            ResponseStatusEnum.OK,
            transactionService.getTransaction(id.toLong())
        )
    }

    @PostMapping("")
    fun createTransaction() {
        // TODO: Implement
    }
}