package com.example.controller;


import com.example.dto.BaseResponse;
import com.example.dto.OpenTimeDto;
import com.example.service.impl.OpenTimeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "open-times")
@RequiredArgsConstructor
public class OpenTimeController {

    private final OpenTimeServiceImpl openTimeService;


    @PostMapping
    public ResponseEntity<BaseResponse> addNewOpenTime(@RequestBody OpenTimeDto openTimeDto) {

        return ResponseEntity.ok(BaseResponse.builder()
                .message("")
                .result("")
                .build());
    }
}
