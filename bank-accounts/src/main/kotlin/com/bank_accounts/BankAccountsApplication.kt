package com.bank_accounts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankAccountsApplication

fun main(args: Array<String>) {
	runApplication<BankAccountsApplication>(*args)
}
