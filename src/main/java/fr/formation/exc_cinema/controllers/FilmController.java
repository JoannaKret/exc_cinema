package fr.formation.exc_cinema.controllers;

import fr.formation.exc_cinema.models.Film;
import fr.formation.exc_cinema.services.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("films")
public class FilmController {

    FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> getAllFilms() {
        return this.filmService.getAllFilms();
    }

    @GetMapping("{id}")
    public Optional<Film> getFilmById(@PathVariable String id) {
        return this.filmService.findFilmById(id);
    }

    @PostMapping
    public Film addFilm(@RequestBody Film film) {
        return this.filmService.saveFilm(film);
    }

    @PutMapping
    public Film updateFilm(@RequestBody Film film) {
        return this.filmService.saveFilm(film);
    }

    @DeleteMapping
    public String removeFilm(@RequestBody Film film) {
        this.filmService.removeFilm(film);
        return "Le film " + film.getTitre() + " vient d'être supprimé.";
    }
}
