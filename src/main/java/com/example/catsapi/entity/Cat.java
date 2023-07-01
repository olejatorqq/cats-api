package com.example.catsapi.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Cat {
    @Id
    private String id;
    private String name;
    private LocalDate birthday;
    private LocalDateTime createAt;
}
