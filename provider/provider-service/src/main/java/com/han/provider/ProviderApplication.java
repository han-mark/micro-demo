package com.han.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  全在com.han.provider路径下可不加@ComponentScan
 *
 * @author han
 */
@EnableFeignClients(basePackages = "com.han.provider.handler")
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
