package com.example.somding_backend.mapper.project;

import com.example.somding_backend.mapper.EntityMapper;
import com.example.somding_backend.model.dto.project.ProjectListDto;
import com.example.somding_backend.model.response.project.ProjectListRes;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjectListMapper extends EntityMapper<ProjectListRes, ProjectListDto> {
    ProjectListMapper INSTANCE = Mappers.getMapper(ProjectListMapper.class);
}
