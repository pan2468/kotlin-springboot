package com.springboot.service


import com.springboot.entity.Order
import com.springboot.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Transactional
@Service
class OrderService{

    @Autowired
    private lateinit var orderRepository: OrderRepository

    fun orderCreate(order: Order){
        orderRepository.save(order)
    }



}