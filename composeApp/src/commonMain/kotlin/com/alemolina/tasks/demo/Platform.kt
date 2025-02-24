package com.alemolina.tasks.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform