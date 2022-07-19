package co.com.poli.bookingservice.persistence.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Long id;

    @NotEmpty(message = "El userId no puede estar vacio")
    @Column(name = "user_id")
    private Long userId;

    @NotEmpty(message = "El showtimesId no puede estar vacio")
    @Column(name = "showtimes_id")
    private Long showtimesId;

}
