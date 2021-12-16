package fr.formation.exc_cinema.repositories;

import fr.formation.exc_cinema.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IFilmRepository extends MongoRepository<Film, String> {

}
