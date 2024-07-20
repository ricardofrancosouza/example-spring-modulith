package com.rivi.notification

import com.rivi.com.rivi.events.ProductCreated
import com.rivi.notification.internal.Notification
import com.rivi.notification.internal.NotificationType
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import org.springframework.transaction.event.TransactionalEventListener


@Service
class NotificationService {
    private val logger: org.slf4j.Logger? = LoggerFactory.getLogger(NotificationService::class.java)

    @Async
    @TransactionalEventListener
    fun notificationEvent(event: ProductCreated){
        val notification = toEntity(event)
        logger?.info("Received notification by event for product: $notification.")
    }

    private fun toEntity(notificationDTO: ProductCreated)= Notification(
            date = notificationDTO.date,
            format = NotificationType.valueOf(notificationDTO.format),
            productName = notificationDTO.productName
        )
}