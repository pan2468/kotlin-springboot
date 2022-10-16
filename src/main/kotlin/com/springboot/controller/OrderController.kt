package com.springboot.controller

import com.springboot.dto.OrderDto
import com.springboot.entity.Order
import com.springboot.service.OrderService
import lombok.extern.log4j.Log4j2
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
@RequestMapping("/order")
@Log4j2
class OrderController {

    @Autowired
    private lateinit var orderService: OrderService

    // 주문 등록
    @PostMapping("/create")
    fun orderCreate(@ModelAttribute order: Order){
        orderService.orderCreate(order)
    }

    // 주문 목록 조회
    @GetMapping("/list")
    fun orderList(): List<Order>{
        return orderService.orderList()
    }

    // 주문 상세 조회
    @GetMapping("/detail/{id}")
    fun orderById(@PathVariable id : Long): Optional<Order>{
        return orderService.orderById(id)
    }

    // 주문 수정
    @PutMapping("/update")
    fun orderUpdate(@ModelAttribute order: Order){
        order.orderUpdate(order)
        orderService.orderUpdate(order)
    }


    // 주문 삭제
    @DeleteMapping("/delete/{id}")
    fun orderDelete(@PathVariable id : Long){
        return orderService.orderDelete(id)
    }
}

