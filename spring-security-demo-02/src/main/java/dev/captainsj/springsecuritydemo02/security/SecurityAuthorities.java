package dev.captainsj.springsecuritydemo02.security;

import dev.captainsj.springsecuritydemo02.entity.Authorities;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthorities implements GrantedAuthority {

    private final Authorities authorities;

    @Override
    public String getAuthority() {
        return authorities.getName();
    }
}
