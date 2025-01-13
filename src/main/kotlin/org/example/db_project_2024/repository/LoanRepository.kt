package org.example.db_project_2024.repository

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class LoanRepository(private val jdbcTemplate: JdbcTemplate) {

}