package fr.formation.exc_cinema.config;

import fr.formation.exc_cinema.repositories.IFilmRepository;
import fr.formation.exc_cinema.services.FilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilmConfiguration {

    @Bean
    public FilmService filmService(IFilmRepository filmRepository) {
        return new FilmService(filmRepository);
    }


}
