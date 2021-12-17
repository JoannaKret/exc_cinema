package fr.formation.exc_cinema.controllers;

import fr.formation.exc_cinema.models.Ticket;
import fr.formation.exc_cinema.services.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("tickets")
public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> getTickets() {
        return this.ticketService.getAllTickets();
    }

    @GetMapping("myticket/{id}")
    public Optional<Ticket> getTicketById(@PathVariable String id) {
        return this.ticketService.getTicktById(id);
    }

    @PostMapping
    public Ticket generateTicket(@RequestBody Ticket ticket) {
        return this.ticketService.saveTicket(ticket);
    }
}
