package com.ms.movieinfo.service;

import com.ms.movieinfo.repository.MovieRepository;
import com.ms.movieinfo.vo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(final MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> getMovieById(Long movieId){
        return movieRepository.findById(movieId);
    }
}
