package org.savek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
public class ClientApplication {
    public static void main(String... args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
