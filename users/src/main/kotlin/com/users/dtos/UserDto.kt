package com.users.dtos

import com.fasterxml.jackson.annotation.JsonProperty

data class UserDto(
    val name: String,
    val password: String? = null,
    @JsonProperty("bank_account_amount")
    val bankAccountAmount: Double,
    @JsonProperty("bank_account_id", required = false)
    val bankAccountId: Int? = null,
    @JsonProperty("bank_account_owner_id", required = false)
    val bankAccountOwnerId: Int? = null
)