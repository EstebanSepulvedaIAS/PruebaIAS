package com.example.eventos.infrastructure.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class EvenstEntity {
    @jakarta.persistence.Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name= "name", nullable = false)
    private String name;

    @Column(name= "date", nullable = false)
    private String date;

    @Column(name= "location", nullable = false)
    private String location;

}
