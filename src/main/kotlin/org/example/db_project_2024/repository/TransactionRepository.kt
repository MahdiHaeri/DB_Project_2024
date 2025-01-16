package org.example.db_project_2024.repository

import org.example.db_project_2024.model.Transaction
import org.example.db_project_2024.model.User
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class TransactionRepository(private val jdbcTemplate: JdbcTemplate) {
    fun findAllTransactions(): List<Transaction> {
        val sql = "SELECT * FROM transactions"
        return jdbcTemplate.query(sql) { rs, _ ->
            Transaction(
                id = rs.getLong("id"),
                senderId = rs.getLong("sender_id"),
                receiverId = rs.getLong("receiver_id"),
                value = rs.getDouble("value"),
                type = rs.getString("type"),
                status = rs.getString("status"),
                openDate = rs.getString("open_date"),
                closeDate = rs.getString("close_date"),
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
                senderId = rs.getLong("sender_id"),
                receiverId = rs.getLong("receiver_id"),
                value = rs.getDouble("value"),
                type = rs.getString("type"),
                status = rs.getString("status"),
                openDate = rs.getString("open_date"),
                closeDate = rs.getString("close_date"),
                createdAt = rs.getString("created_at"),
                updatedAt = rs.getString("updated_at")
            )
        }
    }

    fun findTransactionById(id: Long): Transaction? {
        val sql = "SELECT * FROM public.transactions WHERE id = ?"
        return jdbcTemplate.queryForObject(sql, { rs, _ ->
            Transaction(
                id = rs.getLong("id"),
                senderId = rs.getLong("sender_id"),
                receiverId = rs.getLong("receiver_id"),
                value = rs.getDouble("value"),
                type = rs.getString("type"),
                status = rs.getString("status"),
                openDate = rs.getString("open_date"),
                closeDate = rs.getString("close_date"),
                createdAt = rs.getString("created_at"),
                updatedAt = rs.getString("updated_at")
            )
        }, id)
    }
}