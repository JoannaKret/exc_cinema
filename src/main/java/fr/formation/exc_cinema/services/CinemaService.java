package fr.formation.exc_cinema.services;

import fr.formation.exc_cinema.DTOs.CinemaDTO;
import fr.formation.exc_cinema.models.Cinema;
import fr.formation.exc_cinema.repositories.ICinemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

public class CinemaService {

    ICinemaRepository cinemaRepository;
    ModelMapper modelMapper;

    public CinemaService(ICinemaRepository cinemaRepository,
                         ModelMapper modelMapper) {
        this.cinemaRepository = cinemaRepository;
        this.modelMapper = modelMapper;
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

    public CinemaDTO getCinemaName(String id) {
        Optional<Cinema> cinema = this.cinemaRepository.findById(id);
        CinemaDTO cinemaDTO = modelMapper.map(cinema, CinemaDTO.class);
        return cinemaDTO;
    }
}
