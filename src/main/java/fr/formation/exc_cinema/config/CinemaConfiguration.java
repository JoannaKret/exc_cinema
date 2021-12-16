package fr.formation.exc_cinema.config;

import fr.formation.exc_cinema.repositories.ICinemaRepository;
import fr.formation.exc_cinema.services.CinemaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CinemaConfiguration {

    @Bean
    public CinemaService cinemaService(ICinemaRepository cinemaRepository) {
        return new CinemaService(cinemaRepository);
    }

}
