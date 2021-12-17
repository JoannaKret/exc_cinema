package fr.formation.exc_cinema.controllers;


import fr.formation.exc_cinema.models.Seance;
import fr.formation.exc_cinema.services.SeanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("seances")
public class SeanceController {

    SeanceService seanceService;

    public SeanceController(SeanceService seanceService) {
        this.seanceService = seanceService;
    }

    @GetMapping
    public List<Seance> getAllSeances() {
        return this.seanceService.getAllSeances();
    }

    @GetMapping("{id}")
    public Optional<Seance> gtSeanceById(@PathVariable String id) {
        return this.seanceService.findById(id);
    }

    @PostMapping
    public Seance addNewSeance(@RequestBody Seance seance) {
        return this.seanceService.saveSeance(seance);
    }

    @PutMapping
    public Seance updateSeance(@RequestBody Seance seance) {
        return this.seanceService.saveSeance(seance);
    }

    @DeleteMapping
    public String removeSeance(@RequestBody Seance seance) {
        this.seanceService.deleteSeance(seance);
        return "La séance de film: " + seance.getFilm().getTitre() + " vient d'être supprimée";
    }

    @GetMapping("films/{filmId}")
    public List<Seance> getSeanceByFilmId(@PathVariable String filmId) {
        return this.seanceService.findSeanceByFilm(filmId);
    }
}
