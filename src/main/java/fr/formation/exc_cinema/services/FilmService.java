package fr.formation.exc_cinema.services;

import fr.formation.exc_cinema.models.Film;
import fr.formation.exc_cinema.repositories.IFilmRepository;

import java.util.List;
import java.util.Optional;

public class FilmService {

    IFilmRepository filmRepository;

    public FilmService(IFilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAllFilms() {
        return this.filmRepository.findAll();
    }

    public Optional<Film> findFilmById(String id) {
        return this.filmRepository.findById(id);
    }

    public Film saveFilm(Film film) {
        return this.filmRepository.save(film);
    }

    public void removeFilm(Film film) {
        this.filmRepository.delete(film);
    }
}
