package com.bank_accounts.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class BankAccount(
    @Id
    @GeneratedValue
    val id: Int = 0,

    @Column(nullable = false)
    val amount: Double,

    @Column(nullable = false)
    val ownerId: Int
)