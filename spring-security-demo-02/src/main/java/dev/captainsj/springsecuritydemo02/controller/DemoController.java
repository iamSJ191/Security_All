package dev.captainsj.springsecuritydemo02.controller;

import dev.captainsj.springsecuritydemo02.entity.User;
import dev.captainsj.springsecuritydemo02.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoController {

    private final UserRepository userRepository;

    @GetMapping("/demo")
    public String demo() {
        var u = SecurityContextHolder.getContext();
        u.getAuthentication().getAuthorities().stream().forEach(System.out::println);
        return "Demo!";
    }

    @PostMapping("/user/add")
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
