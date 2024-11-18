package com.example.order_processing.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order_processing.models.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);  // Finds a user by their username
    boolean existsByUsername(String username); 
    // Optional: You can add more queries if needed based on roles or other criteria.
    Optional<AppUser> findByUsernameAndRole(String username, String role);  // Find by username and role
}
