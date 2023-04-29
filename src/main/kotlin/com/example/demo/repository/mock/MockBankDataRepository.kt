package com.example.demo.repository.mock

import com.example.demo.model.Bank
import com.example.demo.repository.BankDataRepositoryI
import org.springframework.stereotype.Repository

@Repository
class MockBankDataRepository : BankDataRepositoryI {

    val banks = mutableListOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5678", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}