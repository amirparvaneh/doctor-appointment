package com.example.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "time_slots")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpenTimeSlot extends BaseEntity{
    private Date start_time;
    private Date end_time;

    @ManyToOne
    @JoinColumn(name = "open_time_id")
    @JsonIgnore
    private OpenTime openTime;

    @OneToOne(mappedBy = "openTimeSlot")
    @Nullable
    private Appointment appointment;
}
