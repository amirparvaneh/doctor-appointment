package com.example.service;

import com.example.dto.OpenTimeDto;
import com.example.dto.OpenTimeResponseDto;

public interface OpenTimeService {

    OpenTimeResponseDto addOpenTime(OpenTimeDto openTimeDto);
}
