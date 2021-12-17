package fr.formation.exc_cinema.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaDTO {

    @Id
    private String id;
    private String nom;

}
