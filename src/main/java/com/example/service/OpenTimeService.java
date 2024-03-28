package com.example.service;

import com.example.dto.OpenTimeDto;
import com.example.dto.OpenTimeResponseDto;

public interface OpenTimeService {

    OpenTimeResponseDto addOpenTimeByDoctor(Long doctorId,OpenTimeDto openTimeDto);
}
