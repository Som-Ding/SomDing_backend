package com.example.somding_backend.repository.review;

import com.example.somding_backend.model.entity.review.Review;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Override
    <S extends Review> S save(S entity);

    @Query(value = "SELECT * FROM review WHERE user_id = :userId", nativeQuery = true)
    List<Review> getAllReviewByUserId(Long userId);
}
