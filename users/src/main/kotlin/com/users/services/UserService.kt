package com.users.services

import com.users.clients.BankAccountClient
import com.users.dtos.BankAccountDto
import com.users.dtos.UserDto
import com.users.entities.User
import com.users.repositories.UserRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class UserService(
    private val repository: UserRepository,
    private val bankAccountClient: BankAccountClient,
) {
    @Transactional
    fun createUser(userDto: UserDto): UserDto {
        userDto.password ?: throw Exception("user password is required")
        val savedUser = this.repository.save(User(
            name = userDto.name,
            password = userDto.password
        ))

        val bankAccountResponse = bankAccountClient.createBankAccount(BankAccountDto(
            amount = userDto.bankAccountAmount,
            ownerId = savedUser.id
        ))

        return UserDto(name = savedUser.name, bankAccountAmount = bankAccountResponse.amount, bankAccountId = bankAccountResponse.id, bankAccountOwnerId = savedUser.id)
    }
}