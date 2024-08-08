package org.javatop.cart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-27 16:23
 * @description :
 */

@EnableFeignClients(basePackages = "org.javatop.api.client")
@MapperScan("org.javatop.cart.mapper")
@SpringBootApplication
public class CartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CartApplication.class, args);
        Environment environment = context.getBean(Environment.class);

        System.out.println("访问链接：http://localhost:" + environment.getProperty("server.port"));
        System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功 ლ(´ڡ`ლ)ﾞ \n");
    }
}
