package com.example.controller;


import com.example.service.impl.PatientServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/patiens")
@Slf4j
@RequiredArgsConstructor
public class PatientController {

    private final PatientServiceImpl patientService;
}
