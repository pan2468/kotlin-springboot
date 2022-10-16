package com.springboot.service

import com.springboot.entity.Guest
import com.springboot.repository.GuestRepository
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDateTime
import org.junit.jupiter.api.Assertions.assertEquals


@RunWith(SpringRunner :: class)
@SpringBootTest
@TestPropertySource(locations = ["classpath:application.properties"])
class GuestServiceTest{

    @Autowired
    private lateinit var guestRepository: GuestRepository

    @Test
    @DisplayName("회원가입 테스트")
    fun guestCreate(){
        val singUp : Guest = Guest()
        singUp.userName = "user"
        singUp.createDate = LocalDateTime.now()
        singUp.email = "test@test.com"
        singUp.password = "123456789@"

        val save : Guest = guestRepository.save(singUp)
        println(save.toString())
    }

    @Test
    @DisplayName("회원 중복 테스트")
    fun questOverlap(){
        this.guestCreate()

        val list : List<Guest> = guestRepository.findAll()
        val list1 : List<Guest> = guestRepository.findAll()

        assertEquals(list.get(0).userName, list1.get(0).userName)
        assertEquals(list.get(0).email, list1.get(0).email)
    }

}