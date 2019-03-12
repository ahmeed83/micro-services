package com.ms.moviecatalog;

import com.ms.moviecatalog.vo.Rating;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		Rating forObject = restTemplate.getForObject("http://localhost:9393/api/rating/user-123", Rating.class);

		System.out.println(forObject.toString());

	}

}
