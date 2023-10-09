package com.example.somding_backend.controller.qna;

import com.example.somding_backend.dto.request.qna.AnswerReq;
import com.example.somding_backend.dto.request.qna.QnaReq;
import com.example.somding_backend.dto.response.qna.QnaRes;
import com.example.somding_backend.entity.qna.Qna;
import com.example.somding_backend.exception.base.BaseResponse;
import com.example.somding_backend.service.qna.QnaService;
import com.fasterxml.jackson.databind.ser.Serializers.Base;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private QnaService qnaService;

    //등록
    @PostMapping("")
    @ResponseBody
    public BaseResponse<QnaRes> addQna(@RequestBody QnaReq req){
        QnaRes res = qnaService.addQna(req);

        return BaseResponse.onSuccess(res);
    }
    //답변 등록
    @PostMapping("/answers/{qnaId}")
    @ResponseBody
    public BaseResponse<QnaRes> addAnswear(@PathVariable("qnaId") Long qnaId, @RequestBody AnswerReq req){
        QnaRes res = qnaService.addAnswer(qnaId,req);

        return BaseResponse.onSuccess(res);
    }

    //단일 조회
    @GetMapping("/{qnaId}")
    @ResponseBody
    public BaseResponse<QnaRes> getQna(@PathVariable("qnaId") Long qnaId){
        QnaRes res = qnaService.getQna(qnaId);
        return BaseResponse.onSuccess(res);

    }

    //상품별 조회
    //위 함수와 구별 할 수 있게 uri 수정
//    @GetMapping("/{productId}")
//    @ResponseBody
//    public BaseResponse<QnaRes> getQnaByProductId(@PathVariable("productId") Long productId){
//
//        res.setProjectId(productId);
//
//        return BaseResponse.onSuccess(res);
//    }

    //수정
    @PatchMapping("/{qnaId}")
    @ResponseBody
    public BaseResponse<QnaRes> updateQna(@PathVariable("qnaId") Long qnaId, @RequestBody QnaReq req){
        QnaRes res = qnaService.updateQna(qnaId, req);
        return BaseResponse.onSuccess(res);
    }

    //삭제
    @DeleteMapping("/{qnaId}")
    @ResponseBody
    public BaseResponse<String> deleteQna(@PathVariable("qnaId") Long qnaId){
        qnaService.removeQna(qnaId);
        return BaseResponse.onSuccess(null);
    }


}
