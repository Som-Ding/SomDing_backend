package com.example.somding_backend.service.review;

import com.example.somding_backend.model.entity.review.Review;
import com.example.somding_backend.model.request.review.ReviewReq;
import com.example.somding_backend.model.response.review.ReviewRes;
import com.example.somding_backend.repository.review.ReviewRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public ReviewRes addReview(ReviewReq req) {
        Review review = new Review(req);
        Review r = reviewRepository.save(review);

        ReviewRes res = new ReviewRes(r);

        return res;
    }

    public ReviewRes getReviewById(Long reviewId) {
        Review r = reviewRepository.findById(reviewId).get();

        ReviewRes res = new ReviewRes(r);

        return res;
    }

    public List<ReviewRes> getAllReviewByUserId(Long userId) {
        List<Review> review = reviewRepository.getAllReviewByUserId(userId);
        List<ReviewRes> reviewRes = new ArrayList<>();

        for(Review r: review){
            ReviewRes res = new ReviewRes(r);
            reviewRes.add(res);
        }
        return reviewRes;

    }

    public boolean removeReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);

        return true;
    }

    public void changeReview(Long reviewId, ReviewReq req) {
        Review review = reviewRepository.findById(reviewId).get();
        Review update = new Review(reviewId,req);

        reviewRepository.save(update);
    }
}
