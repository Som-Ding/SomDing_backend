package com.example.somding_backend.service.main;

import com.example.somding_backend.mapper.project.ProjectListMapper;
import com.example.somding_backend.model.dto.project.ProjectListDto;
import com.example.somding_backend.model.request.project.ProjectFilterReq;
import com.example.somding_backend.model.response.project.ProjectListRes;
import com.example.somding_backend.repository.project.ProjectQueryRepository;
import com.example.somding_backend.repository.project.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainPageService {
    private final ProjectQueryRepository projectQueryRepository;
    private final ProjectListMapper projectListMapper;

    public List<ProjectListRes> getMainProjectList(ProjectFilterReq projectFilterReq){
        return projectListMapper.toDto(projectQueryRepository.getMainProjectList(projectFilterReq));
    }
    public List<ProjectListRes> getRankingProjectList(){
        List<ProjectListDto> projectListDtos = projectQueryRepository.getRankingProjectList();
        return projectListMapper.toDto(projectQueryRepository.getRankingProjectList());
    }
}
