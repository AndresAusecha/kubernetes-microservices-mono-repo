package com.users.kubernets

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubernetsApplication

fun main(args: Array<String>) {
	runApplication<KubernetsApplication>(*args)
}
