package fr.formation.exc_cinema.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.annotation.sql.DataSourceDefinitions;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeanceDTO {

    @Id
    private String id;
    private Date date;
}
