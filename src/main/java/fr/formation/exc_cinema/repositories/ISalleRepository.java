package fr.formation.exc_cinema.repositories;

import fr.formation.exc_cinema.models.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ISalleRepository extends MongoRepository<Salle, String> {

}
