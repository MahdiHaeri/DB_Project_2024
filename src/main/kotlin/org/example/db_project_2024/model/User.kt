package org.example.db_project_2024.model

data class User(
    val id: Long,
    val username: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val role: String,
    val phoneNumber: String,
    val email: String,
    val address: String,
    val createdAt: String,
    val updatedAt: String
)