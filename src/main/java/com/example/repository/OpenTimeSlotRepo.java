package com.example.repository;

import com.example.model.OpenTimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OpenTimeSlotRepo extends JpaRepository<OpenTimeSlot,Long> {
}
