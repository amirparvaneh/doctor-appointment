package com.example.controller;


import com.example.dto.BaseResponse;
import com.example.service.impl.OpenTimeSlotServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "open-time-slots")
@RequiredArgsConstructor
@Slf4j
public class OpenTimeSlotController {

    private final OpenTimeSlotServiceImpl openTimeSlotService;

    //todo
    @GetMapping
    public ResponseEntity<BaseResponse> getOpenTimeSlotOfOneDoctor(){
        return ResponseEntity.ok(BaseResponse.builder().build());
    }
}
