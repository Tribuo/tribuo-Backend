package com.tribuo.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author Camilo Aguado
 */
@SpringBootApplication
@EnableJpaRepositories("com.tribuo.backend.repositories")
@EntityScan("com.tribuo.backend.jpa")
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
