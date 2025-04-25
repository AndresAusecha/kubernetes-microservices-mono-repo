package com.bank_accounts.controllers

import com.bank_accounts.dtos.BankAccountDTO
import com.bank_accounts.services.BankAccountService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/bank-accounts")
class BankAccountController(
    private val bankAccountService: BankAccountService
) {
    @PostMapping
    fun createBankAccount(@RequestBody createBankAccount: BankAccountDTO): ResponseEntity<BankAccountDTO> {
        return ResponseEntity(bankAccountService.createBankAccount(createBankAccount), HttpStatus.OK)
    }
}