package dev.captainsj.springsecuritydemo02.security;

import dev.captainsj.springsecuritydemo02.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        log.info("loadByUsername called....");
        var user = userRepository.findUserByUsername(username);

        log.info("User :: {}", user.stream().toList());

        return user.map(SecurityUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("No user found with username " + username));
    }
}
