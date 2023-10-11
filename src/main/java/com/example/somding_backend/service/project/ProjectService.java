package com.example.somding_backend.service.project;

import com.example.somding_backend.model.entity.project.Project;
import com.example.somding_backend.model.request.project.ProjectReq;
import com.example.somding_backend.model.response.project.ProjectRes;
import com.example.somding_backend.repository.project.ProjectRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public ProjectRes addProject(ProjectReq req) {
        Project prj = new Project(req);
        Project p = projectRepository.save(prj);

        ProjectRes res = new ProjectRes(p);

        return res;
    }

    public ProjectRes getProjectById(Long projectId) {
        Project proj = projectRepository.findById(projectId).get();
        return new ProjectRes(proj);
    }

    public List<ProjectRes> getAllByUserId(Long userId) {
        //user 권한 확인
        List<Project> proj = projectRepository.getAllByUserId(userId);
        List<ProjectRes> projRes  = new ArrayList<>();

        for(Project p: proj){
            ProjectRes res = new ProjectRes(p);
            projRes.add(res);
        }
        return projRes;
    }

    public boolean removeProject(Long projectId) {
        //후원자가 1도 없을 때 삭제 가능
        ProjectRes proj = getProjectById(projectId);
        if(proj.getSponsorNum() > 0) {
            projectRepository.deleteById(projectId);
            return true;
        }
        return false;
    }

}
