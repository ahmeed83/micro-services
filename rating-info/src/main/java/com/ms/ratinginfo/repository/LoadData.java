package com.ms.ratinginfo.repository;

import com.ms.ratinginfo.vo.Rating;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadData {

    @Bean
    CommandLineRunner initDatabase(RatingRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Rating("user-123", "1", "5")));
            log.info("Preloading " + repository.save(new Rating("user-334", "2", "4")));
        };
    }
}
