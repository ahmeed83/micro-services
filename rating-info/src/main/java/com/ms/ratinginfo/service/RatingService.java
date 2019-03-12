package com.ms.ratinginfo.service;

import com.ms.ratinginfo.repository.RatingRepository;
import com.ms.ratinginfo.vo.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    @Autowired
    public RatingService(final RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public Optional<Rating> getRatingByUserId(String userId){
        return ratingRepository.findByUserId(userId);
    }
}
