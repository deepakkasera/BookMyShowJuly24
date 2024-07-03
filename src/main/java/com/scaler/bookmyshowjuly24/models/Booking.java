package com.scaler.bookmyshowjuly24.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel { // Ticket
    private User user;
    private Show show;
    private List<ShowSeat> showSeats;
    private int amount;
    private List<Payment> payments;
    private BookingStatus bookingStatus;
}
