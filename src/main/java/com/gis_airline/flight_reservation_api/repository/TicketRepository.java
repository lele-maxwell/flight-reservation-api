package com.gis_airline.flight_reservation_api.repository;


import com.gis_airline.flight_reservation_api.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByOriginAddressContainingIgnoreCase(String originAddress);
    List<Ticket> findByDestinationAddressContainingIgnoreCase(String destinationAddress);
    List<Ticket> findByCompanyNameContainingIgnoreCase(String companyName);
}