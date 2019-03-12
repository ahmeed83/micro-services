package com.ms.ratinginfo.repository;

import com.ms.ratinginfo.vo.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Long> {

    Optional<Rating> findByUserId(String userId);
}
