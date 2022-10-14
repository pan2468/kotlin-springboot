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
@Table(name = "order")
@ToString
@Setter @Getter
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long ? = null,

    var userName: String,

    var title: String,

    var content: String,

    ){
    constructor(title: String, content: String, writer: String) : this(null, title, content, writer)

    fun updateBoard(title: String, content: String){
        this.title = title
        this.content = content
    }
}