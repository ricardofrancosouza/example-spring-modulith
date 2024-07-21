package com.rivi.com.rivi

import com.rivi.com.rivi.product.ProductEventTest
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class OrderObserver {

    @EventListener
    fun test(productEventTes: ProductEventTest){
        println()
    }
}