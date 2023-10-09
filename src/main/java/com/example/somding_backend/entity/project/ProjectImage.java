package com.example.somding_backend.entity.project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_img")
public class ProjectImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_image_id")
    private Long ProjectImageId;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
