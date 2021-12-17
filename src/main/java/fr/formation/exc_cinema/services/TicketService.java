package fr.formation.exc_cinema.services;

import fr.formation.exc_cinema.models.Ticket;
import fr.formation.exc_cinema.repositories.ITicketRepository;

import java.util.List;
import java.util.Optional;

public class TicketService {

    ITicketRepository ticketRepository;

    public TicketService(ITicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
       return this.ticketRepository.findAll();
    }

    public Optional<Ticket> getTicktById(String id) {
        return this.ticketRepository.findById(id);
    }

    public Ticket saveTicket(Ticket ticket) {
        return this.ticketRepository.save(ticket);
    }
}
