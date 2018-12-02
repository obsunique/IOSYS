package com.example.Util.RedisUtil;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public class RedisUtil {
	
	@Cacheable(value = "user", key = "#id")  //插入缓存
    public void get() {
		
    }

    @CachePut(value = "user", key = "#user.id")		//插入缓存
    public void saveOrUpdate() {

    }

    @CacheEvict(value = "user", key = "#id")  //从缓存中清除
    public void test() {

    }

}
