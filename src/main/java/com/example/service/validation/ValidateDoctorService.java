package com.example.service.validation;

import com.example.exception.NotFoundException;
import com.example.repository.DoctorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidateDoctorService {

    private final DoctorRepo doctorRepo;

    public void validateDoctorById(Long doctorId){
        doctorRepo.findById(doctorId).orElseThrow(()-> new NotFoundException(doctorId));
    }
}
