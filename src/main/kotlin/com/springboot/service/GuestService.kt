package com.springboot.service

import com.springboot.entity.Guest
import com.springboot.repository.GuestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
 class GuestService {

    @Autowired
    private lateinit var guestRepository: GuestRepository

    fun saveGuest(guest: Guest){
        guestRepository.save(guest);
    }
}