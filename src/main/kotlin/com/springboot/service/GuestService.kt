package com.springboot.service

import com.springboot.entity.Guest
import com.springboot.repository.GuestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class GuestService : UserDetailsService{

    @Autowired
    private lateinit var guestRepository: GuestRepository

    fun saveGuest(guest: Guest){
        guestRepository.save(guest);
    }

    override fun loadUserByUsername(userId: String?): UserDetails {
        val guest : Guest = guestRepository.findByUserId(userId) ?: throw UsernameNotFoundException(userId)

        return User.builder()
            .username(guest.userId)
            .password(guest.password)
            .roles(guest.role.toString())
            .build()
    }
}