package com.leyou.item.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ItemServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemServerApplication.class, args);
    }
}
