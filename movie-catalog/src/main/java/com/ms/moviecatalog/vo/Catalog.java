package com.ms.moviecatalog.vo;

import lombok.Data;

@Data
public class Catalog {

    private final String movieName;
    private final String movieDate;
    private final String movieRating;

    public Catalog(final String movieName, final String movieDate, final String movieRating) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieRating = movieRating;
    }
}
