package fr.formation.exc_cinema.services;

import fr.formation.exc_cinema.models.Cinema;
import fr.formation.exc_cinema.repositories.ICinemaRepository;

import java.util.List;
import java.util.Optional;

public class CinemaService {

    ICinemaRepository cinemaRepository;

    public CinemaService(ICinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public List<Cinema> getAll() {
        return this.cinemaRepository.findAll();
    }

    public Optional<Cinema> findById(String id) {
        return this.cinemaRepository.findById(id);
    }

    public Cinema saveCinema(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    public void removeCinema(Cinema cinema) {
        this.cinemaRepository.delete(cinema);
    }
}
