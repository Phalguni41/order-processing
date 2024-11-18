package com.example.order_processing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserDetailsServiceConfig {

    private final PasswordEncoder passwordEncoder;

    // Constructor injection for PasswordEncoder
    public UserDetailsServiceConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();

        // Define a user with "USER" role
        manager.createUser(
            User.withUsername("user")
                .password(passwordEncoder.encode("password"))
                .roles("USER") // ROLE_USER
                .build()
        );

        // Define an admin with "ADMIN" role
        manager.createUser(
            User.withUsername("admin")
                .password(passwordEncoder.encode("admin123"))
                .roles("ADMIN") // ROLE_ADMIN
                .build()
        );

        return manager;
    }
}
