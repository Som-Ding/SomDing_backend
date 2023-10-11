package com.example.somding_backend.model.dto.project;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectListDto {
    // id
    private Long projectId;
    // 카테고리
    private ProjectCategory category;
    // 제목
    private String title;
    // 달성률
    private Integer achievement;

}
