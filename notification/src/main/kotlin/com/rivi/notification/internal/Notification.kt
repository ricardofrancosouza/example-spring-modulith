package com.rivi.notification.internal

import java.util.Date

data class Notification(val date: Date, val format: NotificationType, val productName: String)
