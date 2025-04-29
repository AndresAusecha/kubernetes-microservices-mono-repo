package com.users.controllers

import com.users.dtos.UserDto
import com.users.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UsersController(
    private val userService: UserService
) {
    @PostMapping
    fun createUser(@RequestBody createUser: UserDto): ResponseEntity<UserDto> {
        return ResponseEntity(userService.createUser(createUser), HttpStatus.OK)
    }
}