package com.scaler.bookmyshowjuly24.services;

import com.scaler.bookmyshowjuly24.models.Booking;

import java.util.List;

public interface BookingService {
    Booking createBooking(Long userId, Long showId, List<Long> showSeatIds);
}
