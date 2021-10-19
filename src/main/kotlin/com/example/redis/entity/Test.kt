package com.example.redis.entity

import org.springframework.data.redis.core.RedisHash
import javax.persistence.Id

@RedisHash(value = "test")
data class Test(
    @Id
    val key: String,
    val value: String
)
