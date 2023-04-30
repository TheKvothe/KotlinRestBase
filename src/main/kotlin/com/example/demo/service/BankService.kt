package com.example.demo.service

import com.example.demo.model.Bank
import com.example.demo.repository.BankDataRepositoryI
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class BankService ( private val datasource:BankDataRepositoryI) {

    fun getBanks () : Collection<Bank> = datasource.retrieveBanks()
    fun getBank(accountNumber: String): Bank {
        return datasource.retrieveBank(accountNumber)
    }
    fun addBank (bank: Bank) : Bank = datasource.createBank(bank)
    fun updateBank(bank: Bank): Bank = datasource.updateBank(bank)
    fun deleteBank(accountNumber: String): Unit = datasource.deleteBank(accountNumber)
}