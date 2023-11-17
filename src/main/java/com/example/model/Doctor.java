package com.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor extends BaseEntity {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    @OneToMany(mappedBy = "doctor")
    private List<AvailableTimeSlot> availableTimeSlots;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

}
