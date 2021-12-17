package fr.formation.exc_cinema.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaDTO {

    @Id
    @JsonIgnore
    private String id;
    private String nom;

}
