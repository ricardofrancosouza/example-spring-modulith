package com.rivi.product

import com.rivi.com.rivi.events.ProductCreated
import com.rivi.product.internal.Product
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.Date

@Service
class ProductService(private val events: ApplicationEventPublisher) {

    @Transactional
    fun create(product: Product){
        events.publishEvent(ProductCreated(date = Date(), "SMS", product.name))
    }
}