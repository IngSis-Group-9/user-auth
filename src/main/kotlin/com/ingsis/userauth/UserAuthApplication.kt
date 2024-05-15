package com.ingsis.userauth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserAuthApplication

fun main(args: Array<String>) {
    runApplication<UserAuthApplication>(*args)
}
