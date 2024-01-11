package com.example.springdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication {
//curl -X POST -H 'Content-Type: application/json' -d '{"code":"33","firstName":"John","lastName":"William"}' http://localhost:8080/customers
    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);
    }

}
