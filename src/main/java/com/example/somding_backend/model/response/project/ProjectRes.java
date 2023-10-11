package com.example.somding_backend.model.response.project;

import java.time.LocalDate;

import com.example.somding_backend.model.entity.project.Project;
import lombok.Data;

@Data
public class ProjectRes {
    private Long projectId;
    private String title;
    private String introduce;
    private String policy;
    private String schedule;

    private int sponsorNum;
    private LocalDate targetAt;
    private String category;
    private int targetPrice;
    private int price;
    private int userId;

    private String photo;

    public ProjectRes(Project proj){
        this.projectId = proj.getProjectId();
        this.title = proj.getTitle();
        this.introduce = proj.getIntroduce();
        this.schedule = proj.getSchedule();
        this.sponsorNum = proj.getSponsorNum();
        this.targetAt = proj.getTargetAt();
        this.category = String.valueOf(proj.getCategory());
        this.price = proj.getPrice();
//        this.price = proj.getUser().
        this.photo = proj.getPhoto();
        this.targetPrice = proj.getTargetPrice();

    }
}

