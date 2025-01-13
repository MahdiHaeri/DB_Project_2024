import org.example.db_project_2024.model.User
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class UserRepository(private val jdbcTemplate: JdbcTemplate) {

    fun findAllUsers(): List<User> {
        val sql = "SELECT * FROM users"
        return jdbcTemplate.query(sql) { rs, _ ->
            User(
                id = rs.getLong("id"),
                username = rs.getString("username"),
                password = rs.getString("password"),
                firstName = rs.getString("first_name"),
                lastName = rs.getString("last_name"),
                email = rs.getString("email"),
                role = rs.getString("role"),
                phoneNumber = rs.getString("phone_number"),
                address = rs.getString("address"),
                createdAt = rs.getString("created_at"),
                updatedAt = rs.getString("updated_at")
            )
        }
    }

    fun findUserById(id: Long): User? {
        val sql = "SELECT * FROM users WHERE id = ?"
        return jdbcTemplate.queryForObject(sql, { rs, _ ->
            User(
                id = rs.getLong("id"),
                username = rs.getString("username"),
                password = rs.getString("password"),
                firstName = rs.getString("first_name"),
                lastName = rs.getString("last_name"),
                email = rs.getString("email"),
                role = rs.getString("role"),
                phoneNumber = rs.getString("phone_number"),
                address = rs.getString("address"),
                createdAt = rs.getString("created_at"),
                updatedAt = rs.getString("updated_at")
            )
        }, id)
    }

    fun findUserByUsername(username: String): User? {
        val sql = "SELECT * FROM users WHERE username = ?"
        return jdbcTemplate.queryForObject(sql, { rs, _ ->
            User(
                id = rs.getLong("id"),
                username = rs.getString("username"),
                password = rs.getString("password"),
                firstName = rs.getString("first_name"),
                lastName = rs.getString("last_name"),
                email = rs.getString("email"),
                role = rs.getString("role"),
                phoneNumber = rs.getString("phone_number"),
                address = rs.getString("address"),
                createdAt = rs.getString("created_at"),
                updatedAt = rs.getString("updated_at")
            )
        }, username)
    }

    fun createUser(user: User): Int {
        val sql = "INSERT INTO users (username, password, first_name, last_name, email, role, phone_number, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
        return jdbcTemplate.update(sql, user.username, user.password, user.firstName, user.lastName, user.email, user.role, user.phoneNumber, user.address)
    }

    fun updateUser(user: User): Int {
        val sql = "UPDATE users SET username = ?, password = ?, first_name = ?, last_name = ?, email = ?, role = ?, phone_number = ?, address = ? WHERE id = ?"
        return jdbcTemplate.update(sql, user.username, user.password, user.firstName, user.lastName, user.email, user.role, user.phoneNumber, user.address, user.id)
    }

    fun deleteUser(id: Long): Int {
        val sql = "DELETE FROM users WHERE id = ?"
        return jdbcTemplate.update(sql, id)
    }
}
