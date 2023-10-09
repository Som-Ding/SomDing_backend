package com.example.somding_backend.dto.request.qna;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class QnaReq {
    private Long userId;
    private Long projectId;
    private Long orderId;
    private String title;
    private String question;
    private boolean isPrivate;
}
