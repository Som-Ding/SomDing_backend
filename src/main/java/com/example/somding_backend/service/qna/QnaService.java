package com.example.somding_backend.service.qna;

import com.example.somding_backend.model.request.qna.AnswerReq;
import com.example.somding_backend.model.entity.qna.Qna;
import com.example.somding_backend.model.request.qna.QnaReq;
import com.example.somding_backend.model.response.qna.QnaRes;
import com.example.somding_backend.repository.qna.QnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService {

    @Autowired
    private QnaRepository qnaRepository;
    public QnaRes addQna(QnaReq req) {
        Qna qna = new Qna(req);
        Qna resQna = qnaRepository.save(qna);
        QnaRes res = new QnaRes(resQna);
        return res;

    }


    public QnaRes addAnswer(Long qnaId, AnswerReq req) {
        Qna qna = qnaRepository.findById(qnaId).get();
        qna.setAnswer(req.getAns());

        return new QnaRes(qna);
    }

    public QnaRes getQna(Long qnaId) {
         Qna qna = qnaRepository.findById(qnaId).get();

         return  new QnaRes(qna);
    }

    public void removeQna(Long qnaId) {
        qnaRepository.deleteById(qnaId);
    }

    public QnaRes updateQna(Long qnaId, QnaReq req) {
        Qna qna = qnaRepository.findById(qnaId).get();
        QnaRes res = new QnaRes(req);

        return res;
    }
}
