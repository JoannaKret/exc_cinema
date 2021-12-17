package fr.formation.exc_cinema.services;

import fr.formation.exc_cinema.DTOs.SeanceDTO;
import fr.formation.exc_cinema.models.Seance;
import fr.formation.exc_cinema.repositories.ISeanceRepository;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;

public class SeanceService {

    ISeanceRepository seanceRepository;
    ModelMapper modelMapper;

    public SeanceService(ISeanceRepository seanceRepository,
                         ModelMapper modelMapper) {
        this.seanceRepository = seanceRepository;
        this.modelMapper = modelMapper;
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

    public SeanceDTO getSeanceDate(String id) {
        Optional<Seance> seance = this.seanceRepository.findById(id);
        SeanceDTO seanceDTO = modelMapper.map(seance, SeanceDTO.class);
        return seanceDTO;
    }
}
