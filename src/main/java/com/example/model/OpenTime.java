package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OpenTime extends BaseEntity{

    @Column(name = "open_date")
    private Date date;
    @Temporal(TemporalType.TIMESTAMP)
    private Date starTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    @JsonIgnore
    private Doctor doctor;

    @OneToMany(mappedBy = "open_time")
    private List<OpenTimeSlot> openTimeSlotList;
}
