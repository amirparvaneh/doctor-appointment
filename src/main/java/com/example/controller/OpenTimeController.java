package com.example.controller;


import com.example.dto.BaseResponse;
import com.example.dto.OpenTimeDto;
import com.example.service.ApiVersion;
import com.example.service.impl.OpenTimeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiVersion.VERSION + "/open-times")
@RequiredArgsConstructor
public class OpenTimeController {

    private final OpenTimeServiceImpl openTimeService;

    @PostMapping(value = "/add-by-doctor/{doctorId}")
    public ResponseEntity<BaseResponse> addNewOpenTime(@PathVariable(value = "doctorId") Long doctorId,
                                                       @RequestBody OpenTimeDto openTimeDto) {
        openTimeService.addOpenTimeByDoctor(doctorId, openTimeDto);
        return ResponseEntity.ok(BaseResponse.builder()
                .message("")
                .result("")
                .build());
    }
}
