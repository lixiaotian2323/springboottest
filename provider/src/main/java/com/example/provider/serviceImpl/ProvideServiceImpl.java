package com.example.provider.serviceImpl;

/**
 * @author lixiaotian
 * @since 2021/06/21 13:55
 */

import com.example.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


@Service
public class ProvideServiceImpl implements ProviderService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    /**
     * 设置key，value存入redis
     *
     * @param key
     * @param value
     * @param time
     */
    @Override
    public String setValue() {
        redisTemplate.opsForValue().set("myKey","myValue");
        String value1 = redisTemplate.opsForValue().get("myKey");
        return value1;
    }


}
