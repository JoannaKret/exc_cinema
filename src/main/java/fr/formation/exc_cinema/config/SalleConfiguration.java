package fr.formation.exc_cinema.config;

import fr.formation.exc_cinema.repositories.ISalleRepository;
import fr.formation.exc_cinema.services.SalleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalleConfiguration {

    @Bean
    public SalleService salleService(ISalleRepository salleRepository) {
        return new SalleService(salleRepository);
    }
}
