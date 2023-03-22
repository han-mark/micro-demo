package com.han;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 *  ComponentScan 识别com.han.provider/consumer
 *
 * @author han
 */
@EnableFeignClients(basePackages = {"com.han.*.handler"})
@ComponentScan(basePackages = {"com.han.*"})
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
