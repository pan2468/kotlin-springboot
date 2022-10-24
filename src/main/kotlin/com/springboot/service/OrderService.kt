package com.springboot.service

import com.springboot.entity.Order
import com.springboot.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*


@Transactional
@Service
class OrderService{

    @Autowired
    private lateinit var orderRepository: OrderRepository

    // 주문 등록
    fun orderCreate(order: Order) {
        orderRepository.save(order)
    }

    //주문 목록 조회
    fun orderList(): List<Order>{
        val orderList: List<Order> = orderRepository.findAll()
        return orderList
    }

    // 주문 상세 조회
    fun orderById(id: Long): Optional<Order> {
        return orderRepository.findById(id)
    }

    // 주문 수정 조회
    fun orderUpdate(order: Order){
        orderRepository.save(order)
    }


    // 주문 삭제
    fun orderDelete(id: Long) {
        return orderRepository.deleteById(id)
    }

}