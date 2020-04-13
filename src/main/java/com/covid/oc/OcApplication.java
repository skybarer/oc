package com.covid.oc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.covid.oc.*"})
public class OcApplication {
    public static void main(String[] args) {
        SpringApplication.run(OcApplication.class, args);
    }
}
