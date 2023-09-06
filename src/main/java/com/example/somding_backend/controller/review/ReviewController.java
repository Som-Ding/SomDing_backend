package com.example.somding_backend.controller.review;

import com.example.somding_backend.dto.project.ProjectRes;
import com.example.somding_backend.dto.review.ReviewReq;
import com.example.somding_backend.dto.review.ReviewRes;
import com.example.somding_backend.exception.base.BaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class ReviewController {

    //등록

    @PostMapping("/products/reviews")
    public BaseResponse<ReviewRes> addReview(@RequestBody ReviewReq req){
        ReviewRes res = new ReviewRes();

        res.setReviewId(2L);
        res.setTitle(req.getTitle());
        res.setContent(req.getContent());
        res.setRate(4.5f);

        return BaseResponse.onSuccess(res);
    }

    //



}
