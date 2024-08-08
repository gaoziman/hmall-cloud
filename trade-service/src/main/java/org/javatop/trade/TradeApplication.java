package org.javatop.trade;

import org.javatop.api.config.DefaultFeignConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-08-08 09:29
 * @description :
 */
@EnableFeignClients(basePackages = "org.javatop.api.client", defaultConfiguration = DefaultFeignConfig.class)
@MapperScan("org.javatop.trade.mapper")
@SpringBootApplication
public class TradeApplication {
    public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(TradeApplication.class, args);
            Environment environment = context.getBean(Environment.class);

            System.out.println("访问链接：http://localhost:" + environment.getProperty("server.port"));
            System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功 ლ(´ڡ`ლ)ﾞ \n");
        }
}
