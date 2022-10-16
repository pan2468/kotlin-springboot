package com.springboot.dto

import com.springboot.entity.Order
import jdk.nashorn.internal.objects.NativeFunction.apply


class OrderDto{

    var id: Long? = null
    var userName: String? = null
    var title: String? = null
    var content: String? = null


    fun orderUpdate(userName: String, title: String, content: String){
            this.userName = userName
            this.title = title
            this.content = content
    }

}