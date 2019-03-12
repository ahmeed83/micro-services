package com.ms.moviecatalog.rest;

import com.ms.moviecatalog.service.MovieService;
import com.ms.moviecatalog.service.RatingService;
import com.ms.moviecatalog.vo.Catalog;
import com.ms.moviecatalog.vo.Movie;
import com.ms.moviecatalog.vo.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catalog")
public class MovieCatalogController {

    private final MovieService movieService;

    private final RatingService ratingService;

    @Autowired
    public MovieCatalogController(final MovieService movieService, final RatingService ratingService) {
        this.movieService = movieService;
        this.ratingService = ratingService;
    }

    @GetMapping("/{userId}")
    public Catalog getCatalogs(@PathVariable("userId") String userId){
        Rating rating = ratingService.getRating(userId);
        Movie movie = movieService.getMovie(rating.getMovieId());
        return new Catalog(movie.getName(), movie.getDate(), rating.getStar());
    }
}
