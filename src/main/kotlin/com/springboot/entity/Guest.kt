package com.springboot.entity

import com.springboot.constant.Role
import lombok.Getter
import lombok.Setter
import lombok.ToString
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "guests")
@ToString
@Setter @Getter
class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id : Long ?= null

    var userName : String ?= null

    var createDate: LocalDateTime = LocalDateTime.now()

    var userId : String ?= null

    var password: String ?= null

    @Enumerated(EnumType.STRING)
    var role: Role? = null

    constructor(userName: String, userId: String, createDate: LocalDateTime, password: String){
        this.userName = userName
        this.userId = userId
        this.createDate = createDate
        this.password = password
    }
}