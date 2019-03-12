package com.ms.moviecatalog.service;

import com.ms.moviecatalog.vo.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RatingService {

    @Value("${rating-url}")
    private String ratingUrl;

    private final RestTemplate restTemplate;

    @Autowired
    public RatingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Rating getRating(String userId) {
        return restTemplate.getForObject(ratingUrl + userId, Rating.class);
    }
}
