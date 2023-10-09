package com.example.somding_backend.repository.project;

import com.example.somding_backend.entity.project.Project;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Override
    <S extends Project> S save(S entity);

    @Override
    Optional<Project> findById(Long aLong);

    @Query(value = "SELECT * project where user_id = :userId", nativeQuery = true)
    List<Project> getAllByUserId(Long userId);

    @Override
    void deleteById(Long aLong);
}


