package com.example.somding_backend.model.request.review;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewReq {
    private Long orderId;
    private String title;
    private String content;
    private float rate;

    private String photo;
}
