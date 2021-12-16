package fr.formation.exc_cinema.controllers;

import fr.formation.exc_cinema.models.Salle;
import fr.formation.exc_cinema.services.SalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("salles")
public class SalleController {

    SalleService salleService;

    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }

    @GetMapping
    public List<Salle> findAllSalles() {
        return this.salleService.getAllSalles();
    }

    @GetMapping("{id}")
    public Optional<Salle> findById(@PathVariable String id) {
        return this.salleService.findById(id);
    }

    @PostMapping
    public Salle addSale(@RequestBody Salle salle) {
        return this.salleService.saveSalle(salle);
    }

    @PutMapping
    public Salle updateSale(@RequestBody Salle salle) {
        return this.salleService.saveSalle(salle);
    }

    @DeleteMapping
    public String removeSalle(@RequestBody Salle salle) {
        this.salleService.removeSalle(salle);
        return "La salle vient d'être suprimée";
    }
}
