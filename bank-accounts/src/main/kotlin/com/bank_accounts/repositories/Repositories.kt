package com.bank_accounts.repositories

import com.bank_accounts.entities.BankAccount
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BankAccountRepository: JpaRepository<BankAccount, Int>