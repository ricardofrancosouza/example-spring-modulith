package com.rivi.accounting.notification

import com.rivi.accounting.notification.internal.Notification
import com.rivi.accounting.notification.internal.NotificationType
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.transaction.event.TransactionalEventListener


@Service
class NotificationService {
    private val logger: org.slf4j.Logger? = LoggerFactory.getLogger(NotificationService::class.java)
    @Transactional
    fun createNotification(event: NotificationDTO){
        val notification = toEntity(event)
        logger?.info("Received notification by module dependency for product: $notification.")
    }

    @Async
    @TransactionalEventListener
    fun notificationEvent(event: NotificationDTO){
        val notification = toEntity(event)
        logger?.info("Received notification by event for product: $notification.")
    }

    private fun toEntity(notificationDTO: NotificationDTO)= Notification(
            date = notificationDTO.date,
            format = NotificationType.valueOf(notificationDTO.format),
            productName = notificationDTO.productName
        )
}