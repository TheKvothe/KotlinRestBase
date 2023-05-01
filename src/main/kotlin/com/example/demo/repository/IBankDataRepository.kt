package com.example.demo.repository

import com.example.demo.model.Bank

interface IBankDataRepository {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber : String): Bank

    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
    fun deleteBank(accountNumber: String)
}