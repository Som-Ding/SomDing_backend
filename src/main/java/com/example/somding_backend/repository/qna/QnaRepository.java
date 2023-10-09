package com.example.somding_backend.repository.qna;

import com.example.somding_backend.entity.qna.Qna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QnaRepository extends JpaRepository<Qna, Long> {

    @Override
    <S extends Qna> S save(S entity);
}
