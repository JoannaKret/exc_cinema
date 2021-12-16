package fr.formation.exc_cinema.services;

import fr.formation.exc_cinema.models.Salle;
import fr.formation.exc_cinema.repositories.ISalleRepository;

import java.util.List;
import java.util.Optional;

public class SalleService {

    ISalleRepository salleRepository;

    public SalleService(ISalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    public List<Salle> getAllSalles() {
        return this.salleRepository.findAll();
    }

    public Optional<Salle> findById(String id) {
        return this.salleRepository.findById(id);
    }

    public Salle saveSalle(Salle salle) {
        return this.salleRepository.save(salle);
    }

    public void removeSalle(Salle salle) {
        this.salleRepository.delete(salle);
    }
}
