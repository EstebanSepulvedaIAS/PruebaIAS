package com.example.eventos.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpa extends JpaRepository<UserEntity, String>{
}
