package com.springboot.service

import com.springboot.entity.Order
import com.springboot.repository.OrderRepository
import org.junit.Test
import org.junit.jupiter.api.DisplayName
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
@TestPropertySource(locations = ["classpath:application.properties"])
class OrderServiceTest{

    @Autowired
    private lateinit var orderRepository: OrderRepository

    @Test
    @DisplayName("저장 테스트")
    fun orderInsert(){
        val orders: Order  = Order("user_test", "content_test", "제목" )

        orderRepository.save(orders);
        println(orders.toString())
    }
}
