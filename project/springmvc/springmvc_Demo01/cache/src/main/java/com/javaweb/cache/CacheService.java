package com.javaweb.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


@Component
public class CacheService {
    @Autowired
    private JedisPool jedisPool;

    public void set(String key,String value){
        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            jedis.set(key, value);
        }finally{
            if(jedis != null){
                jedis.close();
            }
        }
    }

    public String get(String key){
        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            return jedis.get(key);
        }finally{
            if(jedis != null){
                jedis.close();
            }
        }
    }


    public void del(String key){
        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            jedis.del(key);
        }finally{
            if(jedis != null){
                jedis.close();
            }
        }
    }

}
