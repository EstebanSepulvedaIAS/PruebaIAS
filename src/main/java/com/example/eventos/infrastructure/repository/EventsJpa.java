package com.example.eventos.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsJpa extends JpaRepository<EvenstEntity, String> {

    List<EvenstEntity> findAll();

}
