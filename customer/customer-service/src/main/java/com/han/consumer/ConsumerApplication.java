package com.han.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 *  不加@ComponentScan 会无法识别com.han.provider包下的类
 *
 * @author han
 */
@EnableFeignClients(basePackages = {"com.han.*.handler"})
@ComponentScan(basePackages = {"com.han.*"})
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
