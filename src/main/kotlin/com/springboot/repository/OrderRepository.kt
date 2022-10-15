package com.springboot.repository

import com.springboot.entity.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository("orderRepository")
interface OrderRepository: JpaRepository<Order, Long>{

}