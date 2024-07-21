package com.rivi.com.rivi.product

import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class TestService(private val events: ApplicationEventPublisher) {
//    @EventListener
//    fun test(productEventTes: ProductEventTest){
//        println()
//    }

    fun create(){
        events.publishEvent(ProductEventTest("SMS"))
    }
}