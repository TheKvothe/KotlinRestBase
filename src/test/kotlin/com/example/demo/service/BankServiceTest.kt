package com.example.demo.service

import com.example.demo.repository.BankDataRepositoryI
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BankServiceTest {
    private val dataSource: BankDataRepositoryI = mockk(relaxed = true)

    private val bankService = BankService(dataSource)
    @Test
    fun `should call the bank repository`(){
        //given

        //when
        bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}