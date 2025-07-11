package com.gis_airline.flight_reservation_api.model;



import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(indexes = {
    @Index(name = "idx_origin", columnList = "originAddress"),
    @Index(name = "idx_company", columnList = "companyName")
})
//@Builder
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String companyName;
    private String originAddress;
    private String destinationAddress;
    private LocalDate kickoffDate;
}
