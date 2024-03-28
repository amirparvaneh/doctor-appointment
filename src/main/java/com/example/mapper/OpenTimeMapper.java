package com.example.mapper;



import com.example.dto.OpenTimeDto;
import com.example.model.OpenTime;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OpenTimeMapper {

    OpenTimeMapper INSTANCE = Mappers.getMapper(OpenTimeMapper.class);

    OpenTime openTimeDtoToOpenTime(OpenTimeDto openTimeDto);
}
