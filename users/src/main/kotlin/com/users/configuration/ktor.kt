package com.users.configuration

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class KtorCreator(){
    @Bean
    fun ktorGenerator() = HttpClient(CIO) {
      install(ContentNegotiation) {
        json(Json {
            prettyPrint = true
            isLenient = true
        })
      }
    }
}