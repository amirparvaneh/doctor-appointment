package com.example.mapper;



import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OpenTimeMapper {

    OpenTimeMapper INSTANCE = Mappers.getMapper(OpenTimeMapper.class);
}
