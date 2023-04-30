package com.example.demo.repository

import com.example.demo.model.Bank

interface BankDataRepositoryI {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber : String): Bank

    fun createBank(bank: Bank): Bank
}