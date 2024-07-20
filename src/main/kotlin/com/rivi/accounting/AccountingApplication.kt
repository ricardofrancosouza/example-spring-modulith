package com.rivi.accounting

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.scheduling.annotation.EnableAsync

@EnableAsync
@SpringBootApplication
@ComponentScan(basePackages = ["com.rivi.accounting.*"])
class AccountingApplication

fun main(args: Array<String>) {
	runApplication<AccountingApplication>(*args)
}
