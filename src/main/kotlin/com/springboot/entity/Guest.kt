package com.springboot.entity

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

}