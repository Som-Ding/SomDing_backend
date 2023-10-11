package com.example.somding_backend.model.response.qna;

import lombok.Data;

@Data
public class QnaRes {
    private Long questionId;
    private Long userId;
    private Long projectId;
    private Long orderId;
    private String title;
    private String question;
    private String answer;
    private boolean isPrivate;
}

