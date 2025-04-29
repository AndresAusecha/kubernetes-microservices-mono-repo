package com.users.clients

import com.users.dtos.BankAccountDto
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.utils.EmptyContent.contentType
import io.ktor.http.*
import kotlinx.coroutines.runBlocking
import org.springframework.beans.factory.annotation.Value
import mu.KotlinLogging
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class BankAccountClient(
  private val client: HttpClient,
  @Value("\${bank_accounts.base_url}") private val bankAccountsUrl: String
) {
  fun createBankAccount(bankAccountDto: BankAccountDto): BankAccountDto = runBlocking {
    try {
      client.post(bankAccountsUrl) {
        contentType(ContentType.Application.Json)
        setBody(bankAccountDto)
      }.body()
    } catch (e: Exception){
      logger.error { e.message }
      throw Exception("failure while creating the account")
    }
  }
}