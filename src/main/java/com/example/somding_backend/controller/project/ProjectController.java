package com.example.somding_backend.controller.project;

import com.example.somding_backend.dto.request.project.ProjectReq;
import com.example.somding_backend.dto.response.project.ProjectRes;
import com.example.somding_backend.exception.base.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {


    //프로젝트 생성
    @PostMapping("")
    public BaseResponse<ProjectRes> addProject(@RequestBody ProjectReq req){
        ProjectRes res = new ProjectRes();

        res.setProjectId(1L);
        res.setTitle(req.getTitle());
        res.setIntroduce(req.getIntroduce());
        res.setPrice(req.getPrice());
        res.setPolicy(req.getPolicy());
        res.setCategory(req.getCategory());
        res.setSchedule(req.getSchedule());
        res.setTargetDate(req.getTargetDate());
        res.setTargetPrice(req.getTargetPrice());

        return BaseResponse.onSuccess(res);
    }

    //프로젝트 단일 조회
    @ResponseBody
    @GetMapping("{projectId}")
    public BaseResponse<ProjectRes> getProject(@PathVariable("projectId")Long projectId){
        ProjectRes res = new ProjectRes();
        res.setProjectId(projectId);
        return BaseResponse.onSuccess(res);
    }


    //조회부분 다시 필요
    //프로젝트 조회, 권한 설정
    @ResponseBody
    @GetMapping("")
    public BaseResponse<List<ProjectRes>> getProject(){
        List<ProjectRes> res = new ArrayList<>();
        //for문으로 넣어주기

        return BaseResponse.onSuccess(res);
    }

    //랭킹조회
    public BaseResponse<List<ProjectRes>> getRankProject(){
        List<ProjectRes> res = new ArrayList<>();
        //for문으로 넣어주기

        return BaseResponse.onSuccess(res);
    }

    //검색

    //카테코리별 조회


    //수정 & 권한 설정 해줘야함
    @PatchMapping("/{projectId}")
    public BaseResponse<ProjectRes> changeProject(@PathVariable("projectId")Long projectId){
        ProjectRes res = new ProjectRes();

        return BaseResponse.onSuccess(res);
    }

    //삭제,
    @DeleteMapping("{projectId}")
    public BaseResponse<ProjectRes> removeProject(@PathVariable("projectId")Long projectId){
        ProjectRes res = new ProjectRes();
        //서비스에서 후원자가 없을 시 삭제 진행
        return BaseResponse.onSuccess(null);
    }




}
