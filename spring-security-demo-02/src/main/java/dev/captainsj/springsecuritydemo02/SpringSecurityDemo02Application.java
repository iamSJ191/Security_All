package dev.captainsj.springsecuritydemo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan("dev.captainsj.*")
public class SpringSecurityDemo02Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemo02Application.class, args);
    }
}
