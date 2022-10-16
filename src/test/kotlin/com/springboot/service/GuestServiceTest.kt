package com.springboot.service

import com.springboot.repository.GuestRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner :: class)
@SpringBootTest
@TestPropertySource(locations = ["classpath:application.properties"])
class GuestServiceTest{

    @Autowired
    private lateinit var guestRepository: GuestRepository



}