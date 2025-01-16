package org.example.db_project_2024.model

data class Transaction (
    val id: Long,
    val senderId: Long,
    val receiverId: Long,
    val value: Double,
    val type: String,
    val status: String,
    val openDate: String,
    val closeDate: String,
    val createdAt: String,
    val updatedAt: String
)