package com.example.demo.repository.mock

import com.example.demo.model.Bank
import com.example.demo.repository.IBankDataRepository
import org.springframework.stereotype.Repository

@Repository("Firebase")
class FirebaseRepository : IBankDataRepository {

    val banks = mutableListOf(
        Bank("2222", 3.14, 17),
        Bank("2223", 17.0, 0),
        Bank("2224", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull() { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exists.")
        }
        banks.add(bank)

        return bank
    }

    override fun updateBank(bank: Bank): Bank {
        val currentBank = banks.firstOrNull { it.accountNumber == bank.accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number ${bank.accountNumber}")

        banks.remove(currentBank)
        banks.add(bank)

        return bank
    }

    override fun deleteBank(accountNumber: String) {
        val currentBank = banks.firstOrNull { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")

        banks.remove(currentBank)
    }
}