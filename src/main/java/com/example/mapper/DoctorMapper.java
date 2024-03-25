package com.example.mapper;


import com.example.dto.DoctorDto;
import com.example.model.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    Doctor doctorDtoToDoctor(DoctorDto doctorDto);
}
