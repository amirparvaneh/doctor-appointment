package com.example.service.impl;

import com.example.dto.DoctorDto;
import com.example.exception.UnknownException;
import com.example.mapper.DoctorMapper;
import com.example.model.Doctor;
import com.example.repository.DoctorRepo;
import com.example.service.DoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DoctorServiceImpl implements DoctorService {


    private final DoctorRepo doctorRepo;

    @Override
    public Doctor addNewDoctor(DoctorDto doctorDto) {
        Doctor doctor = DoctorMapper.INSTANCE.doctorDtoToDoctor(doctorDto);
        doctor.setCreatedAt(LocalDateTime.now());
        Doctor addedDoctor = doctorRepo.save(doctor);
        log.info("the entity added with Id: " + addedDoctor.getId());
        return addedDoctor;
    }

    @Override
    public List<Doctor> getDoctors() {
        List<Doctor> doctors;
        try {
            doctors = doctorRepo.findAll();
        }catch(Exception e){
            throw new UnknownException();
        }
        return doctors;
    }
}
