package com.javaweb.cache.conf;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.javaweb.cache"})
public class CacheConfig {

    @Value("${redis.host}")
    private String host;

    @Value("${redis.port}")
    private Integer port;

    @Value("${redis.timeout}")
    private Integer timeout;

    @Bean(name = "jedisPool")
    public JedisPool jedispool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxWaitMillis(30000); 
        config.setMaxTotal(32);       
        config.setMinIdle(6);          
        config.setTestOnBorrow(false);
        config.setTestOnReturn(false);  
        config.setTestWhileIdle(true); 
        config.setTimeBetweenEvictionRunsMillis(30000); 
        return new JedisPool(config, host, port, timeout);
    }
}

