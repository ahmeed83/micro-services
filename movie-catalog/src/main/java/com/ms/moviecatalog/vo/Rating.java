package com.ms.moviecatalog.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Rating {

    @Id @GeneratedValue
    private Long id;
    private final String userId;
    private final String movieId;
    private final String star;

    public Rating(final String userId, final String movieId, final String star) {
        this.userId = userId;
        this.movieId = movieId;
        this.star = star;
    }
}
