package com.example.somding_backend.controller.review;

import com.example.somding_backend.dto.request.review.ReviewReq;
import com.example.somding_backend.dto.response.review.ReviewRes;
import com.example.somding_backend.entity.review.Review;
import com.example.somding_backend.exception.base.BaseResponse;
import com.example.somding_backend.service.review.ReviewService;
import java.util.List;
import javax.swing.plaf.basic.BasicEditorPaneUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    //등록 order 테이븧에
    @PostMapping("")
    @ResponseBody
    public BaseResponse<ReviewRes> addReview(@RequestBody ReviewReq req){
        ReviewRes res = reviewService.addReview(req);
        return BaseResponse.onSuccess(res);
    }

    //상품리뷰 조회
    //해당 상품아이디를 받으면 주문 테이블에서 orderId 조회해서 review 찾아야함
    @GetMapping("{reviewId}")
    @ResponseBody
    public BaseResponse<ReviewRes> getReviewById(@PathVariable("reviewId") Long reviewId){
        ReviewRes res = reviewService.getReviewById(reviewId);
        return BaseResponse.onSuccess(res);
    }
    //내가 쓴 리뷰 조회
    //주문 테이블에서 user_id를 찾아 해당 주문id를 리뷰에 넘겨 줘여함
    @GetMapping("{userId}")
    @ResponseBody
    public BaseResponse<List<ReviewRes>> getAllReviewByUserId(@PathVariable("userId") Long userId){
        List<ReviewRes> res = reviewService.getAllReviewByUserId(userId);
        return BaseResponse.onSuccess(res);
    }
    //수정
    @PatchMapping("{reviewId}") //reviewId를 pathVariable로 넣어주지 않음
    public BaseResponse<ReviewRes> updateReview(@PathVariable("reviewId") Long reviewId, @RequestBody ReviewReq req){
        reviewService.changeReview(reviewId, req);

        return BaseResponse.onSuccess(null);
    }

    //삭제
    @DeleteMapping("{reviewId}")
    @ResponseBody
    public BaseResponse<ReviewRes> removeReview(@PathVariable("reviewId") Long reviewId){
        reviewService.removeReview(reviewId);
        return BaseResponse.onSuccess(null);
    }

}
