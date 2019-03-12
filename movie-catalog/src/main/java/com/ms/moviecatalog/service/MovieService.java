package com.ms.moviecatalog.service;

import com.ms.moviecatalog.vo.Movie;
import com.ms.moviecatalog.vo.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    private final RestTemplate restTemplate;

    @Value("${movie-url}")
    private String movieUrl;

    @Autowired
    public MovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(final String movieId) {
        return restTemplate.getForObject( movieUrl + movieId, Movie.class);
    }


}
