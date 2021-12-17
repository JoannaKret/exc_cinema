package fr.formation.exc_cinema.models;

import com.mongodb.lang.Nullable;
import fr.formation.exc_cinema.DTOs.CinemaDTO;
import fr.formation.exc_cinema.DTOs.SalleDTO;
import fr.formation.exc_cinema.DTOs.SeanceDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Ticket {

    @Id
    private String commande;
    private CinemaDTO nom;
    private Film film;
    private SeanceDTO dateDebut;
    private SalleDTO numeroSalle;
    @Nullable
    private Date dateFin;

    }
