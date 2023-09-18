package com.example.somding_backend.controller.review;

import com.example.somding_backend.dto.request.ReviewReq;
import com.example.somding_backend.dto.response.ReviewRes;
import com.example.somding_backend.exception.base.BaseResponse;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products/reviews")
public class ReviewController {

    //등록 order 테이븧에
    @PostMapping("")
    @ResponseBody
    public BaseResponse<ReviewRes> addReview(@RequestBody ReviewReq req){
        ReviewRes res = new ReviewRes();

        res.setReviewId(2L);
        res.setTitle(req.getTitle());
        res.setContent(req.getContent());
        res.setRate(4.5f);

        return BaseResponse.onSuccess(res);
    }

    //상품리뷰 조회
    //해당 상품아이디를 받으면 주문 테이블에서 orderId 조회해서 review 찾아야함

    //내가 쓴 리뷰 조회
    //주문 테이블에서 user_id를 찾아 해당 주문id를 리뷰에 넘겨 줘여함

    //수정
    @PatchMapping("") //reviewId를 pathVariable로 넣어주지 않음
    public BaseResponse<ReviewRes> updateReview(@RequestBody ReviewReq req){
        ReviewRes res = new ReviewRes();

        res.setContent(req.getContent());
        res.setTitle(req.getTitle());

        return BaseResponse.onSuccess(res);
    }

}
