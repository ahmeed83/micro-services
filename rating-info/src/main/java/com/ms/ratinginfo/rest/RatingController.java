package com.ms.ratinginfo.rest;

import com.ms.ratinginfo.service.RatingService;
import com.ms.ratinginfo.vo.Rating;
import com.ms.ratinginfo.vo.response.MovieList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/rating")
public class RatingController {

    private final RatingService ratingService;

    @Autowired
    public RatingController(final RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/{userId}")
    public Optional<Rating> getOneMovie(@PathVariable String userId){
        return ratingService.getRatingByUserId(userId);
    }
}
