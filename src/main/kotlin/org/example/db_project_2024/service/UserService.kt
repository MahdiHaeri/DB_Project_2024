package org.example.db_project_2024.service

import org.example.db_project_2024.repository.UserRepository
import org.example.db_project_2024.model.User
import org.springframework.stereotype.Service

@Service
class UserService (
    val userRepository: UserRepository
) {
    fun getUsers(): List<User> {
        return userRepository.findAllUsers()
    }

    fun getUserById(id: Long): User? {
        return userRepository.findUserById(id)
    }

    fun getUserByUsername(username: String): User? {
        return userRepository.findUserByUsername(username)
    }

    fun createUser(user: User): Int {
        return userRepository.createUser(user)
    }

    fun updateUser(user: User): Int {
        return userRepository.updateUser(user)
    }

    fun deleteUser(id: Long): Int {
        return userRepository.deleteUser(id)
    }
}