package com.example.redis.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Service

@Service
class RedisService {
    @Autowired
    lateinit var stringRedisTemplate: StringRedisTemplate

    fun getRedisStringValue(key : String){
        val stringValueOperations = stringRedisTemplate.opsForValue()
        println("Redis key: $key")
        println("Redis value: ${stringValueOperations.get(key)}")
    }

    fun setRedisStringValue(key : String, value : String){
        val stringValueOperations = stringRedisTemplate.opsForValue()
        stringValueOperations.set(key, value)
        println("Redis key: $key")
        println("Redis value: ${stringValueOperations.get(key)}")
    }
}