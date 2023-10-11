package com.example.somding_backend.model.entity.project;

import com.example.somding_backend.model.dto.project.ProjectCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;
    private Long userId;
    @Enumerated(value = EnumType.STRING)
    public ProjectCategory category;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDate targetAt;
    private String introduce;
    private String policy;
    private String schedule;
    private int targetPrice;
    private int gatherPrice;
    private int price;
    private int sponsorNum;
}
