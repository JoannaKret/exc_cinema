package fr.formation.exc_cinema.services;

import fr.formation.exc_cinema.DTOs.SalleDTO;
import fr.formation.exc_cinema.models.Salle;
import fr.formation.exc_cinema.repositories.ISalleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

public class SalleService {

    ISalleRepository salleRepository;
    ModelMapper modelMapper;

    public SalleService(ISalleRepository salleRepository,
                        ModelMapper modelMapper) {
        this.salleRepository = salleRepository;
        this.modelMapper = modelMapper;
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

    public SalleDTO getSalleNumero(String id) {
        Optional<Salle> salle = this.salleRepository.findById(id);
        SalleDTO salleDTO = modelMapper.map(salle, SalleDTO.class);
        return salleDTO;
    }
}
