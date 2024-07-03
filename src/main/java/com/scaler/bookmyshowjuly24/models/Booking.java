package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel { // Ticket
    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> showSeats;

    private int amount;

    @OneToMany
    private List<Payment> payments;

    private BookingStatus bookingStatus;
}


/*

  1          1
Booking --- User   => M:1

   1             M
Booking ------ ShowSeat => M:M
   M              1

   1               M
Booking ------  Payment => 1:M
   1                1
 */
