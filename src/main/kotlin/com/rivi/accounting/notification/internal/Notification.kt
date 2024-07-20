package com.rivi.accounting.notification.internal

import java.util.Date

data class Notification(val date: Date, val format: NotificationType, val productName: String)
