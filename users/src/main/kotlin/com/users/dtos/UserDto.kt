package com.users.dtos

class UserDto(
    val name: String,
    val password: String? = null,
    val bankAccountAmount: Double,
    val bankAccountId: Int? = null,
    val bankAccountOwnerId: Int? = null
)