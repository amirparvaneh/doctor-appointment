package com.example.repository;

import com.example.model.OpenTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenTimeRepo extends JpaRepository<OpenTime,Long> {
}
