package com.example.service;

import com.example.dto.DoctorDto;
import com.example.model.Doctor;

public interface DoctorService {

    Doctor addNewDoctor(DoctorDto doctorDto);
}
