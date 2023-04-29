package com.example.demo.repository.mock

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MockBankDataRepositoryTest {

    private val mockDataRepository = MockBankDataRepository()

    @Test
    fun `should provide a list of banks`(){
        //given

        //when
        val banks  = mockDataRepository.retrieveBanks()

        // then
        assert(!banks.isEmpty())
    }



}