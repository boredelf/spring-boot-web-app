package br.com.pdt.springbootwebapp.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/")
    fun index(): ResponseEntity<String> = ResponseEntity.ok("Hello world!")

    fun emptyFunction() = Unit

    fun nestedIfs(): Int = if ((Math.random() * 10) > 5) {
        println("lero")
        println("lero")
        var lero = if (true) 1 else 3
        lero = lero
        if (Math.random() < 0) 2 else 3
    } else 2

}