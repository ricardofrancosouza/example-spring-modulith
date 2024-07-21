package com.rivi.accounting.product

import com.rivi.accounting.notification.NotificationDTO
import com.rivi.accounting.product.internal.Product
import com.rivi.com.rivi.product.ProductEventTest
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.Date

@Service
class ProductService(private val events: ApplicationEventPublisher) {

    @Transactional
    fun create(product: Product){
        events.publishEvent(NotificationDTO(date = Date(), "SMS", product.name))
    }

    @Transactional
    fun create(){
        events.publishEvent(ProductEventTest("SMS"))
    }
}