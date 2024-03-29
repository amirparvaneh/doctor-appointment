package com.example.controller;


import com.example.dto.BaseResponse;
import com.example.dto.DoctorDto;
import com.example.model.Doctor;
import com.example.service.impl.DoctorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorServiceImpl doctorService;


    @PostMapping
    public ResponseEntity<BaseResponse> createNewDoctor(@RequestBody DoctorDto doctorDto){
        Doctor doctor = doctorService.addNewDoctor(doctorDto);
        return ResponseEntity.ok(BaseResponse.builder()
                        .message("doctor save with name :" + doctorDto.getName())
                        .result(doctor.getCreatedAt())
                .build());
    }

}
