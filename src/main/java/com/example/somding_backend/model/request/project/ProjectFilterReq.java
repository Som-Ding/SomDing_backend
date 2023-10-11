package com.example.somding_backend.model.request.project;

import com.example.somding_backend.model.dto.project.ProjectCategory;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Project Search 관련 Request")
public class ProjectFilterReq {
    @Schema(description = "카테고리 검색")
    private String category;
    @Schema(description = "제목 검색")
    private String title;
}
