package com.users.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

@Serializable
data class BankAccountDto(
    @JsonProperty("id", required = false) val id: Int? = null,
    @JsonProperty("amount", required = true) val amount: Double,
    @JsonProperty("owner_id") val ownerId: Int
)