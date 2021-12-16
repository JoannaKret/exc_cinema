package fr.formation.exc_cinema.repositories;

import fr.formation.exc_cinema.models.Cinema;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICinemaRepository extends MongoRepository<Cinema, String> {
}
