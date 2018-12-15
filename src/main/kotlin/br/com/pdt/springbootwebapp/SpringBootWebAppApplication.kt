package br.com.pdt.springbootwebapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootWebAppApplication

fun main(args: Array<String>) {
    runApplication<SpringBootWebAppApplication>(*args)
}

