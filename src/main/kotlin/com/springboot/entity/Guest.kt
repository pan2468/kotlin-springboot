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
    val id : Long ?= null

    val userName : String ?= null

    val createDate: LocalDateTime = LocalDateTime.now()

    val email : String ?= null

    val password: String ?= null

}