package com.example.order_processing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
    .csrf(csrf -> csrf.disable()) // Disable CSRF for APIs
    .authorizeHttpRequests(auth -> auth
        .requestMatchers("/api/orders/**", "/api/payments/**").authenticated()
        .requestMatchers( "/api/shipments/**").hasRole("ADMIN")
        .anyRequest().permitAll()
    )
    .httpBasic(withDefaults()); // Enable Basic Authentication with default settings

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Passwords will be encoded using BCrypt
    }
}
