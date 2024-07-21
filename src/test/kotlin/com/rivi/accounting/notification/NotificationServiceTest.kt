package com.rivi.accounting.notification

import com.rivi.accounting.AccountingApplication
import com.rivi.accounting.product.ProductService
import com.rivi.accounting.product.internal.Product
import com.rivi.com.rivi.product.TestService
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.modulith.test.PublishedEvents

@SpringBootTest(classes = [AccountingApplication::class], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NotificationServiceTest {

    @Autowired
    lateinit var productService: ProductService
    @Autowired
    lateinit var testService: TestService

    @Test
    fun `should pulbish event`(){
        assertDoesNotThrow {
            this.productService.create(Product(
                name = "teste",
                description = "teste",
                price = 200
            ))
            this.testService.create()
        }

    }
}