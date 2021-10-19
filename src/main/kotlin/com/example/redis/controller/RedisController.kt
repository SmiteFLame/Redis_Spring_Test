package com.example.redis.controller

import com.example.redis.service.RedisService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RedisController {

    @Autowired
    lateinit var redisService: RedisService

    @GetMapping("/value")
    fun getRedisStringValue(key : String){
        redisService.getRedisStringValue(key)
    }

    @PostMapping("/value")
    fun setRedisStringValue(@RequestParam map : Map<String, String>){
        if(map["key"] == null || map["value"] == null){
            return
        }
        redisService.setRedisStringValue(map["key"]!!, map["value"]!!)
    }
}