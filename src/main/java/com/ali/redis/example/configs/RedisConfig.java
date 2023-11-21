package com.ali.redis.example.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;


@Configuration
@EnableRedisRepositories
public class RedisConfig {

    @Bean
    public LettuceConnectionFactory connectionFactory(){
        return new LettuceConnectionFactory();
    }

    @Bean
    public RedisTemplate<?,?> template(){
        RedisTemplate<byte[],byte[]> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory());
        return template;
    }
}
