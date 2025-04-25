package com.bank_accounts.services

import com.bank_accounts.dtos.BankAccountDTO
import com.bank_accounts.entities.BankAccount
import com.bank_accounts.repositories.BankAccountRepository
import org.springframework.stereotype.Service

@Service
class BankAccountService(
    private val bankAccountRepository: BankAccountRepository
){
    fun createBankAccount(createBankAccount: BankAccountDTO): BankAccountDTO {
        val savedBankAccount = this.bankAccountRepository
                    .save(BankAccount(amount = createBankAccount.amount, ownerId = createBankAccount.ownerId))

        return BankAccountDTO(
            id = savedBankAccount.id,
            amount = savedBankAccount.amount,
            ownerId = savedBankAccount.ownerId
        )
    }
}