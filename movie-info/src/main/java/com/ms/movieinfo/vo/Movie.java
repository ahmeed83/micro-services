package com.ms.movieinfo.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Movie {

    @Id @GeneratedValue
    private Long id;
    private final String name;
    private final String date;

    public Movie(final String name, final String date) {
        this.name = name;
        this.date = date;
    }
}
