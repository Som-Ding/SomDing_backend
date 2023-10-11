package com.example.somding_backend.repository.project;

import com.example.somding_backend.model.entity.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
