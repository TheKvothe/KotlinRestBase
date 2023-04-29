package com.example.demo.controller

import com.example.demo.model.Bank
import com.example.demo.service.BankService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {


    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()
}