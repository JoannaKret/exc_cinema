package fr.formation.exc_cinema.services;

import fr.formation.exc_cinema.models.Seance;
import fr.formation.exc_cinema.repositories.ISeanceRepository;

import java.util.List;
import java.util.Optional;

public class SeanceService {

    ISeanceRepository seanceRepository;

    public SeanceService(ISeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }

    public List<Seance> getAllSeances() {
        return this.seanceRepository.findAll();
    }

    public Optional<Seance> findById(String id) {
        return this.seanceRepository.findById(id);
    }

    public Seance saveSeance(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    public void deleteSeance(Seance seance) {
        this.seanceRepository.delete(seance);
    }

    public List<Seance> findSeanceByFilm(String filmId) {
        return this.seanceRepository.findByFilm_Id(filmId);
    }
}
