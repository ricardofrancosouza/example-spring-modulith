package com.rivi.product.notification

import com.rivi.product.AccountingApplication
import com.rivi.product.ProductService
import com.rivi.product.internal.Product
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [AccountingApplication::class], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductServiceTest {

    @Autowired
    lateinit var productService: ProductService

    @Test
    fun `should pulbish event`(){
        assertDoesNotThrow {
            this.productService.create(Product(
                name = "teste",
                description = "teste",
                price = 200
            ))
        }

    }
}