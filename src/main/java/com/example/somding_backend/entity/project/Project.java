package com.example.somding_backend.entity.project;

import com.example.somding_backend.dto.request.project.ProjectReq;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private String title;

    private String introduce;

    private String policy;

    private String schedule;

    @Column(name = "target_date")
    private LocalDateTime targetDate;

    private String category;

    @Column(name = "target_price")
    private int targetPrice;

    private int price;

    private String photo;

    @Column(name = "sponsor_num")
    private int sponsorNum;

    @OneToMany(mappedBy = "project")
    private List<ProjectImage> projectImageList = new ArrayList<>();

    public Project(ProjectReq req){
        this.title = req.getTitle();
        this.introduce = req.getIntroduce();
        this.policy = req.getPolicy();
        this.schedule = req.getSchedule();
        this.category = req.getCategory();
        this.targetDate = req.getTargetDate();
        this.price = req.getPrice();
        this.photo = req.getPhoto();
    }


}
