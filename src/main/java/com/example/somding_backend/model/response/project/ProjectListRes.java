package com.example.somding_backend.model.response.project;

import com.example.somding_backend.model.dto.project.ProjectCategory;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Project List 관련 Response")
public class ProjectListRes {
    @Schema(description = "projectId")
    private Long projectId;
    @Schema(description = "카테고리")
    private ProjectCategory category;
    @Schema(description = "제목")
    private String title;
    @Schema(description = "달성률")
    private Integer achievement;
}
