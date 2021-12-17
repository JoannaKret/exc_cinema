package fr.formation.exc_cinema.config;


import fr.formation.exc_cinema.repositories.ISeanceRepository;
import fr.formation.exc_cinema.services.SeanceService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeanceConfiguration {

    @Bean
    public SeanceService seanceService(ISeanceRepository seanceRepository,
                                       ModelMapper modelMapper) {
        return new SeanceService(seanceRepository, modelMapper);
    }
}
