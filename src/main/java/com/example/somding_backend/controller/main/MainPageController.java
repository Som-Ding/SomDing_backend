package com.example.somding_backend.controller.main;

import com.example.somding_backend.model.request.project.ProjectFilterReq;
import com.example.somding_backend.model.response.project.ProjectListRes;
import com.example.somding_backend.service.main.MainPageService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/main")
@Tag(name = "main Page 관련 Controller", description = "main Page 조회 API")
public class MainPageController {
    private final MainPageService mainPageService;

    @GetMapping("/list")
    public List<ProjectListRes> getMainProjectList(@Valid ProjectFilterReq projectFilterReq){
        return mainPageService.getMainProjectList(projectFilterReq);
    }

    @GetMapping("/rank")
    public List<ProjectListRes> getRankingProjectList(){
        return mainPageService.getRankingProjectList();
    }
}
