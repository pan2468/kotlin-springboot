package com.springboot.service

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

class GuestService : UserDetailsService {



    override fun loadUserByUsername(username: String?): UserDetails {
        TODO("Not yet implemented")
    }

}