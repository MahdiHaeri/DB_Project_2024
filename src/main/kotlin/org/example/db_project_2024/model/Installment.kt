package org.example.db_project_2024.model

data class Installment(
    val id: Int,
    val loanId: Int,
    val amount: Double,
    val dueDate: String,
    val status: String,
    val createdAt: String,
    val updatedAt: String
)
