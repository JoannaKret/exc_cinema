package fr.formation.exc_cinema.repositories;

import fr.formation.exc_cinema.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ISeanceRepository extends MongoRepository<Seance, String> {

    List<Seance> findByFilm_Id(String filmId);

}
