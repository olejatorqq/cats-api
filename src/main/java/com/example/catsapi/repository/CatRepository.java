package com.example.catsapi.repository;

import com.example.catsapi.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

interface CatRepository extends JpaRepository<Cat, String> {

}
