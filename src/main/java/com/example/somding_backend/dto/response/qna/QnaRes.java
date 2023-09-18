package com.example.somding_backend.dto.response.qna;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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
