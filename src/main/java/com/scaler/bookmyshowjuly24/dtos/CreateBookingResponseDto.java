package com.scaler.bookmyshowjuly24.dtos;

import com.scaler.bookmyshowjuly24.models.Booking;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookingResponseDto {
    private Booking booking;
    private ResponseStatus responseStatus;
}
