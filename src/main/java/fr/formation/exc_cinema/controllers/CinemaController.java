package fr.formation.exc_cinema.controllers;


import fr.formation.exc_cinema.models.Cinema;
import fr.formation.exc_cinema.services.CinemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cinemas")
public class CinemaController {

    CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public List<Cinema> getAllCinemas() {
        return this.cinemaService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Cinema> findById(@PathVariable String id) {
        return this.cinemaService.findById(id);
    }

    @PostMapping
    public Cinema addCinema(Cinema cinema) {
        return this.cinemaService.saveCinema(cinema);
    }

    @PutMapping
    public Cinema updateCinema(Cinema cinema) {
        return this.cinemaService.saveCinema(cinema);
    }

    @DeleteMapping
    public String removeCinema(Cinema cinema) {
        this.cinemaService.removeCinema(cinema);
        return "Le cinéma à été supprimé.";
    }
}
