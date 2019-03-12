package com.ms.movieinfo.rest;

import com.ms.movieinfo.service.MovieService;
import com.ms.movieinfo.vo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/movie")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(final MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public Optional<Movie> getOneMovie(@PathVariable Long id){
        return movieService.getMovieById(id);
    }
}
