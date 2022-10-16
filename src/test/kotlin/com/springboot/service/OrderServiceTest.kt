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
import org.junit.jupiter.api.Assertions.*
import java.rmi.NotBoundException

import java.util.*


@RunWith(SpringRunner::class)
@SpringBootTest
@TestPropertySource(locations = ["classpath:application.properties"])
class OrderServiceTest{

    @Autowired
    private lateinit var orderRepository: OrderRepository

    @Test
    @DisplayName("저장 테스트")
    fun orderInsert(){
        //val orders: Order  = Order("user_test", "title_test", "menu_test", "내용" )
        val orders: Order = Order()
        orders.userName = "user_test"
        orders.title = "title_test"
        orders.menu = "menu_test"
        orders.content = "content_test"

        orderRepository.save(orders);
        println(orders.toString())
    }

    @Test
    @DisplayName("조회 테스트")
    fun orderList(){
        this.orderInsert()
        var userName = "user_test"
        var title = "title_test"
        var content = "내용"

        var orderList : List<Order> = orderRepository.findAll()
        var list : Order  = orderList.get(0)

        assertEquals(list.userName, userName)
        assertEquals(list.title, title)
        assertEquals(list.content, content)
    }

    @Test
    @DisplayName("상세 조회 테스트")
    fun orderDetail(){
        this.orderInsert()
        var id : Long = 1L
        var orderList : List<Order> = orderRepository.findAll()
        var list : Order = orderList.get(0)

        val detail : Optional<Order> = orderRepository.findById(id)

        assertEquals(list.userName, detail.get().userName)
        assertEquals(list.title, detail.get().title)
        assertEquals(list.content, detail.get().content)
    }

    @Test
    @DisplayName("수정 테스트")
    fun orderUpdate(){
        this.orderInsert()
        val id : Long = 1L
        var title = "title_update"
        var content = "content_update"

        var detail : Optional<Order> = orderRepository.findById(id)
        var list : Order = detail.get()

        list.updateBoard(userName = "user_update", title = "title_update", content = "content_update")
        val update : Order = orderRepository.save(list)

        assertEquals(update.title, title)
        assertEquals(update.content, content)
    }

    @Test
    @DisplayName("삭제 테스트")
    fun orderDelete(){
        val id: Long = 1L
        this.orderInsert()

        orderRepository.deleteById(id)
        var orderList: List<Order> = orderRepository.findAll()

        println(orderList.toString())
    }
}
