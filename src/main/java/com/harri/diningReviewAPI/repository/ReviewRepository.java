package com.harri.diningReviewAPI.repository;

import com.harri.diningReviewAPI.model.Review;
import com.harri.diningReviewAPI.model.ReviewStatus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findReviewsByRestaurantAndStatus(Long restaurantId, ReviewStatus reviewStatus);
    List<Review> findReviewsByStatus(ReviewStatus reviewStatus);
}
