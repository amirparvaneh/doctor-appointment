package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OpenTime extends BaseEntity {

    @Column(name = "open_date")
    private LocalDate date;
    private LocalTime starTime;
    private LocalTime endTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    @JsonIgnore
    private Doctor doctor;

    @OneToMany(mappedBy = "openTime")
    private List<OpenTimeSlot> openTimeSlotList;
}
