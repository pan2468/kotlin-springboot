package com.springboot.repository

import com.springboot.entity.Guest
import org.springframework.data.jpa.repository.JpaRepository

interface GuestRepository : JpaRepository<Guest, Long> {

    fun findByUserId(userId: String?): Guest?

}