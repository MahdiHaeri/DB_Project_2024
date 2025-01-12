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
                firstName = rs.getString("first_name"),
                lastName = rs.getString("last_name"),
                email = rs.getString("email"),
                password = rs.getString("password"),
                role = rs.getString("role"),
                phoneNumber = rs.getString("phone_number"),
                address = rs.getString("address"),
                createdAt = rs.getString("created_at"),
                updatedAt = rs.getString("updated_at")
            )
        }
    }
//
//    fun findUserById(id: Long): User? {
//        val sql = "SELECT * FROM users WHERE id = ?"
//        return jdbcTemplate.queryForObject(sql, { rs, _ ->
//            User(
//                id = rs.getLong("id"),
//                name = rs.getString("name"),
//                email = rs.getString("email")
//            )
//        }, id)
//    }
//
//    fun createUser(user: User): Int {
//        val sql = "INSERT INTO users (name, email) VALUES (?, ?)"
//        return jdbcTemplate.update(sql, user.name, user.email)
//    }
}
