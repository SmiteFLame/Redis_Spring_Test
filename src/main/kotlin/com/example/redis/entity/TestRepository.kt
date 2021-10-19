package com.example.redis.entity

import org.springframework.data.repository.CrudRepository

interface TestRepository : CrudRepository<Test, String>
