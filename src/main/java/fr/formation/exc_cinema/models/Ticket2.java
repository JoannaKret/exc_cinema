package fr.formation.exc_cinema.models;

import org.springframework.data.annotation.Id;

public class Ticket2 {

    @Id
    private String commande;
    private Cinema cinema;
    private Salle salle;
    private Seance seance;
    private Film film;
}
