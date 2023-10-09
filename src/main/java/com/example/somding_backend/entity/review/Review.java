package com.example.somding_backend.entity.review;

import com.example.somding_backend.dto.request.review.ReviewReq;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_id")
    private Long reviewId;

    //주문id

    private String title;

    private String content;

    private float rate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    //userId연결


    //리뷰이미지와 연결
    @OneToMany(mappedBy = "review")
    private List<ReviewImage> reviewImageList = new ArrayList<>();


    public Review(ReviewReq req) {
        this.title = req.getTitle();
        this.content = req.getContent();
        this.rate = req.getRate();

    }

    public Review(Long reviewId, ReviewReq req) {
        this.reviewId = reviewId;
        this.title = req.getTitle();
        this.content = req.getContent();
        this.rate = req.getRate();

    }

}
