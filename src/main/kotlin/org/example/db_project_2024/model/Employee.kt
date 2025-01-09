package org.example.db_project_2024.model

data class Employee(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val password: String,
    val role: String,
    val phoneNumber: String,
    val email: String,
    val address: String,
    val createdAt: String,
    val updatedAt: String
)
