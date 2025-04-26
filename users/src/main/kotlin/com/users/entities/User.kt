package com.users.entities

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

class User(
    @Id
    @GeneratedValue
    val id: Int,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val password: String
)