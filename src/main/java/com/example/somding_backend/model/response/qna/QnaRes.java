package com.example.somding_backend.model.response.qna;

import com.example.somding_backend.model.request.qna.QnaReq;
import lombok.Data;
import com.example.somding_backend.model.entity.qna.Qna;

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

    public QnaRes(Qna resQna) {
        this.title = resQna.getTitle();
        this.question = resQna.getQuestion();
        this.isPrivate = resQna.isPrivate();
    }

    public QnaRes(QnaReq req){

    }
}

