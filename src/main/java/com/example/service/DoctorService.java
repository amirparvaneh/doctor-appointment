package com.example.service;

import com.example.dto.DoctorDto;
import com.example.model.Doctor;

import java.util.List;

public interface DoctorService {

    Doctor addNewDoctor(DoctorDto doctorDto);
    List<Doctor> getDoctors();
}
