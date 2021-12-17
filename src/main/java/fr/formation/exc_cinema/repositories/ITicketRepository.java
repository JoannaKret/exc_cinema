package fr.formation.exc_cinema.repositories;

import fr.formation.exc_cinema.models.Ticket;
import fr.formation.exc_cinema.models.Ticket2;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITicketRepository extends MongoRepository<Ticket, String> {
}
