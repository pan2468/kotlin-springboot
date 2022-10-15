package com.springboot.entity

import lombok.Getter
import lombok.Setter
import lombok.ToString
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "orders")
@ToString
@Setter @Getter
class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long ? = null

    var userName: String? = null

    var title: String? = null

    var content: String? = null

    constructor(userName: String, title: String, content: String){
        this.userName = userName
        this.title = title
        this.content = content
    }


    fun updateBoard(title: String, content: String){
        this.title = title
        this.content = content
    }
}