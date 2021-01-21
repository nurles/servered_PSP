package com.centroafuera.servered

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServeredApplication

fun main(args: Array<String>) {
	runApplication<ServeredApplication>(*args)
}
