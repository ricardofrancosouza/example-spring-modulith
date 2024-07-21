package com.rivi.com.rivi.product

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class TestService {
    @EventListener
    fun test(productEventTes: ProductEventTest){
        println()
    }
}