package com.example.somding_backend.dto.response.project;

import com.example.somding_backend.entity.project.Project;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectRes {
    private Long projectId;
    private String title;
    private String introduce;
    private String policy;
    private String schedule;

    private int sponsorNum;
    private LocalDateTime targetDate;
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
        this.targetDate = proj.getTargetDate();
        this.category = proj.getCategory();
        this.price = proj.getPrice();
//        this.price = proj.getUser().
        this.photo = proj.getPhoto();
        this.targetPrice = proj.getTargetPrice();

    }
}
