package com.gis_airline.flight_reservation_api.controler;


import com.gis_airline.flight_reservation_api.model.Ticket;
import com.gis_airline.flight_reservation_api.service.TicketService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @PostMapping
    public ResponseEntity<Ticket> create(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(ticketService.createTicket(ticket));
    }
    
    @Operation(summary = "Get all tickets")
    @GetMapping
    public ResponseEntity<List<Ticket>> getAll() {
        return ResponseEntity.ok(ticketService.getAllTickets());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getById(@PathVariable Long id) {
    return ticketService.getTicketById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
}
@DeleteMapping("/{id}")
public ResponseEntity<Object> delete(@PathVariable Long id) {
    return ticketService.getTicketById(id)
            .map(ticket -> {
                ticketService.deleteTicketById(id);
                return ResponseEntity.noContent().build();
            })
            .orElseGet(() -> ResponseEntity.notFound().build());
}


    @GetMapping("/search")
    public ResponseEntity<List<Ticket>> search(
            @RequestParam(required = false) String origin,
            @RequestParam(required = false) String destination,
            @RequestParam(required = false) String company
    ) {
        if (origin != null) return ResponseEntity.ok(ticketService.searchByOrigin(origin));
        if (destination != null) return ResponseEntity.ok(ticketService.searchByDestination(destination));
        if (company != null) return ResponseEntity.ok(ticketService.searchByCompany(company));
        return ResponseEntity.badRequest().build();
    }

    
}
