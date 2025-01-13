package org.example.db_project_2024.service

import org.example.db_project_2024.model.Transaction
import org.example.db_project_2024.repository.UserRepository
import org.example.db_project_2024.repository.TransactionRepository
import org.springframework.stereotype.Service

@Service
class TransactionService(
    val userRepository: UserRepository,
    private val transactionRepository: TransactionRepository
) {
    fun getTransactions(): List<Transaction> {
        return transactionRepository.findAllTransactions()
    }

    fun getTransactionByAccountId(accountId: Long): List<Transaction> {
        return transactionRepository.findTransactionsByAccountId(accountId)
    }

    fun getTransaction(id: Long): Transaction? {
        return transactionRepository.findTransactionById(id)
    }
}