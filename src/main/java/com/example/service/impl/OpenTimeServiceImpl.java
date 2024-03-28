package com.example.service.impl;

import com.example.dto.OpenTimeDto;
import com.example.dto.OpenTimeResponseDto;
import com.example.mapper.OpenTimeMapper;
import com.example.model.OpenTime;
import com.example.service.OpenTimeService;
import com.example.service.validation.ValidateDoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class OpenTimeServiceImpl implements OpenTimeService {

    private final ValidateDoctorService validateDoctor;

    @Override
    public OpenTimeResponseDto addOpenTimeByDoctor(Long doctorId,OpenTimeDto openTimeDto) {
        validateDoctor.validateDoctorById(doctorId);
        OpenTime openTime = OpenTimeMapper.INSTANCE.openTimeDtoToOpenTime(openTimeDto);
        openTimeDto.getDate();
        openTime.getStarTime().minusMinutes(30);
        return null;
    }
}
