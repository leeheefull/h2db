package com.leeheefull.h2db

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class H2dbApplication

fun main(args: Array<String>) {
    runApplication<H2dbApplication>(*args)
}
