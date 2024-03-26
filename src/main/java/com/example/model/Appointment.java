package com.example.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PATIENT_APPOINTMENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment extends BaseEntity{

    @Column(name = "firstName")
    private String patientFirstName;
    @Column(name = "lastName")
    private String patientLastName;
    @Column(name = "phoneNumber",unique = true)
    private String patientPhoneNumber;

    @OneToOne
    @JoinColumn(name = "open_time_slot_id")
    @JsonIgnore
    private OpenTimeSlot openTimeSlot;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
