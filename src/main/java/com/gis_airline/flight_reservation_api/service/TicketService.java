package com.gis_airline.flight_reservation_api.service;



import com.gis_airline.flight_reservation_api.model.Ticket;
import com.gis_airline.flight_reservation_api.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public List<Ticket> searchByOrigin(String origin) {
        return ticketRepository.findByOriginAddressContainingIgnoreCase(origin);
    }

    public List<Ticket> searchByDestination(String destination) {
        return ticketRepository.findByDestinationAddressContainingIgnoreCase(destination);
    }


    public Optional<Ticket> getTicketById(Long id) {
    return ticketRepository.findById(id);   
    }

    public List<Ticket> searchByCompany(String company) {
        return ticketRepository.findByCompanyNameContainingIgnoreCase(company);
    }

    public void deleteTicketById(Long id) {
    ticketRepository.deleteById(id);
}

}