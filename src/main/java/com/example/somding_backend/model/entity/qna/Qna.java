package com.example.somding_backend.model.entity.qna;

import com.example.somding_backend.model.request.qna.QnaReq;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Table(name = "qna")
@NoArgsConstructor
@Getter
@Builder
@Setter
public class Qna {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long questionId;


    //user추가

    //프로젝트 id

    //주문id

    private String title;
    private String question;

    private String answer;

    @Column(name = "is_private")
    private boolean isPrivate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Qna(QnaReq req) {
        this.title = req.getTitle();
        this.question = req.getQuestion();
        this.isPrivate = req.isPrivate();

    }

}
