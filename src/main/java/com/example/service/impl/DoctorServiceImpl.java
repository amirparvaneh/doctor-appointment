package com.example.service.impl;

import com.example.dto.DoctorDto;
import com.example.mapper.DoctorMapper;
import com.example.model.Doctor;
import com.example.repository.DoctorRepo;
import com.example.service.DoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DoctorServiceImpl implements DoctorService {


    private final DoctorRepo doctorRepo;

    @Override
    public Doctor addNewDoctor(DoctorDto doctorDto) {
        Doctor doctor = DoctorMapper.INSTANCE.doctorDtoToDoctor(doctorDto);
        Doctor addedDoctor = doctorRepo.save(doctor);
        log.info("the entity added with Id: " + addedDoctor.getId());
        return addedDoctor;
    }
}
