package com.springboot.controller

import com.springboot.entity.Guest
import com.springboot.service.GuestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/guest")
class GuestController {

    @Autowired
    private lateinit var guestService: GuestService

    // 고객 등록
    @PostMapping("/add")
    fun saveMember(@ModelAttribute guest: Guest){

        println("***** 접속 ******")

        guestService.saveGuest(guest)

        println("***** 등록 완료 ******")
    }
}