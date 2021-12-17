package fr.formation.exc_cinema.config;

import fr.formation.exc_cinema.repositories.ITicketRepository;
import fr.formation.exc_cinema.services.TicketService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TicketConfiguration {

    @Bean
    public TicketService ticketService(ITicketRepository ticketRepository) {
        return new TicketService(ticketRepository);
    }

}
