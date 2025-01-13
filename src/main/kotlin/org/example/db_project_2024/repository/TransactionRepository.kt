package org.example.db_project_2024.repository

import org.example.db_project_2024.model.Transaction
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class TransactionRepository(private val jdbcTemplate: JdbcTemplate) {
    fun findAllTransactions(): List<Transaction> {
        val sql = "SELECT * FROM transactions"
        return jdbcTemplate.query(sql) { rs, _ ->
            Transaction(
                id = rs.getLong("id"),
                accountId = rs.getInt("account_id"),
                amount = rs.getDouble("amount"),
                type = rs.getString("type"),
                createdAt = rs.getString("created_at"),
                updatedAt = rs.getString("updated_at")
            )
        }
    }

    fun findTransactionsByAccountId(accountId: Long): List<Transaction> {
        val sql = "SELECT * FROM transactions WHERE account_id = ?"
        return jdbcTemplate.query(sql) { rs, _ ->
            Transaction(
                id = rs.getLong("id"),
                accountId = rs.getInt("account_id"),
                amount = rs.getDouble("amount"),
                type = rs.getString("type"),
                createdAt = rs.getString("created_at"),
                updatedAt = rs.getString("updated_at")
            )
        }
    }

    fun findTransactionById(id: Long): Transaction? {
        val sql = "SELECT * FROM transactions WHERE id = ?"
        return jdbcTemplate.queryForObject(sql) { rs, _ ->
            Transaction(
                id = rs.getLong("id"),
                accountId = rs.getInt("account_id"),
                amount = rs.getDouble("amount"),
                type = rs.getString("type"),
                createdAt = rs.getString("created_at"),
                updatedAt = rs.getString("updated_at")
            )
        }
    }
}