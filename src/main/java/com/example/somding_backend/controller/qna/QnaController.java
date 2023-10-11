package com.example.somding_backend.controller.qna;


import com.example.somding_backend.exception.base.BaseResponse;
import com.example.somding_backend.model.response.qna.QnaRes;
import com.fasterxml.jackson.databind.ser.Serializers.Base;
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
@RequestMapping("/api/products/qna")
public class QnaController {

    //등록
    @PostMapping("")
    @ResponseBody
    public BaseResponse<QnaRes> addQna(@RequestBody RequestBody req){
        QnaRes res = new QnaRes();
        return BaseResponse.onSuccess(res);
    }
    //단일 조회
    @GetMapping("/{qnaId}")
    @ResponseBody
    public BaseResponse<QnaRes> getQna(@PathVariable("qnaId") Long qnaId){
        QnaRes res = new QnaRes();
        res.setQuestionId(qnaId);
        return BaseResponse.onSuccess(res);
    }

    //상품별 조회
    //위 함수와 구별 할 수 있게 uri 수정 가능
    @GetMapping("/{productId}")
    @ResponseBody
    public BaseResponse<QnaRes> getQnaByProductId(@PathVariable("productId") Long productId){
        QnaRes res = new QnaRes();
        res.setProjectId(productId);
        return BaseResponse.onSuccess(res);
    }

    //수정
    @PatchMapping("/{qnaId}")
    @ResponseBody
    public BaseResponse<QnaRes> updateQna(@PathVariable("qnaId") Long qnaId){
        QnaRes res = new QnaRes();
        res.setQuestionId(qnaId);
        return BaseResponse.onSuccess(res);
    }

    //삭제
    @DeleteMapping("/{qnaId}")
    @ResponseBody
    public BaseResponse<QnaRes> deleteQna(@PathVariable("qnaId") Long qnaId){
        QnaRes res = new QnaRes();
        res.setQuestionId(qnaId);
        return BaseResponse.onSuccess(res);
    }
}
