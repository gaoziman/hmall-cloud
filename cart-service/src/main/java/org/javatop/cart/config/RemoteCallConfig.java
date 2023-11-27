package org.javatop.cart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-27 22:04
 * @description :
 */
@Configuration
public class RemoteCallConfig{
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
