package com.example.somding_backend.dto.response.qna;

import com.example.somding_backend.dto.request.qna.QnaReq;
import com.example.somding_backend.entity.qna.Qna;
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

    public QnaRes(Qna resQna) {
        this.title = resQna.getTitle();
        this.question = resQna.getQuestion();
        this.isPrivate = resQna.isPrivate();
    }

    public QnaRes(QnaReq req){
        
    }
}
