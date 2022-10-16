package com.springboot.controller

import com.springboot.entity.Order
import com.springboot.service.OrderService
import lombok.extern.log4j.Log4j2
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order")
@Log4j2
class OrderController {

    @Autowired
    private lateinit var orderService: OrderService

    @PostMapping("/create")
    fun orderCreate(@ModelAttribute order: Order){
        orderService.orderCreate(order)
    }
}

