package com.debrup.microservicesnamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicesNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesNamingServerApplication.class, args);
    }

}
