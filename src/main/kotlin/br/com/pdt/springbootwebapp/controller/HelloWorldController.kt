package br.com.pdt.springbootwebapp.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/")
    fun index(): ResponseEntity<String> = ResponseEntity.ok("Hello world!")

}