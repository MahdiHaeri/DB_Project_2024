package org.example.db_project_2024.model

data class Transaction (
    val id: Long,
    val accountId: Int,
    val amount: Double,
    val type: String,
    val createdAt: String,
    val updatedAt: String
)