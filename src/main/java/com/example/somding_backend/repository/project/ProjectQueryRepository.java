package com.example.somding_backend.repository.project;

import com.example.somding_backend.model.dto.project.ProjectCategory;
import com.example.somding_backend.model.dto.project.ProjectListDto;
import com.example.somding_backend.model.request.project.ProjectFilterReq;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.somding_backend.model.entity.project.QProject.project;

@Repository
@RequiredArgsConstructor
public class ProjectQueryRepository {
    private final JPAQueryFactory queryFactory;

    public List<ProjectListDto> getRankingProjectList(){
        return queryFactory.select(Projections.constructor(
                        ProjectListDto.class,
                        project.projectId,
                        project.category,
                        project.title,
                        project.gatherPrice.divide(project.targetPrice).multiply(100).as("achievement")))
                .from(project)
                .orderBy((project.gatherPrice.divide(project.targetPrice).desc()))
                .fetch();
    }

    public List<ProjectListDto> getMainProjectList(ProjectFilterReq projectFilterReq){
        BooleanBuilder builder = getBooleanBuilder(projectFilterReq);
        return queryFactory.select(Projections.constructor(
                        ProjectListDto.class,
                        project.projectId,
                        project.category,
                        project.title,
                        project.gatherPrice.divide(project.targetPrice).multiply(100).as("achievement")))
                .from(project)
                .where(builder)
                .fetch();
    }

        private BooleanBuilder getBooleanBuilder(ProjectFilterReq projectFilterReq){
            BooleanBuilder builder = new BooleanBuilder();
            if(ObjectUtils.isNotEmpty(projectFilterReq.getCategory())){
                 builder.and(project.category.eq(ProjectCategory.valueOf(projectFilterReq.getCategory())));
            }
            if(ObjectUtils.isNotEmpty(projectFilterReq.getTitle())){
                builder.and(project.title.contains(projectFilterReq.getTitle()));
            }
            return builder;
        }
}
