package org.example.db_project_2024.model

data class Loan (
    val id: Int,
    val amount: Double,
    val interestRate: Double,
    val startDate: String,
    val endDate: String,
    val status: String,
    val createdAt: String,
    val updatedAt: String
)