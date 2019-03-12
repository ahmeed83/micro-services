package com.ms.movieinfo.repository;

import com.ms.movieinfo.vo.Movie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadData {

    @Bean
    CommandLineRunner initDatabase(MovieRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Movie("Terminator 2", "1991")));
            log.info("Preloading " + repository.save(new Movie("Heat", "1995")));
        };
    }
}
