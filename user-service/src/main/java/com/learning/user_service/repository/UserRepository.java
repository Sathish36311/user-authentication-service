package com.learning.user_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.user_service.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(final String username);
}
