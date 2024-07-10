package com.scaler.bookmyshowjuly24.controllers;

import com.scaler.bookmyshowjuly24.dtos.CreateBookingRequestDto;
import com.scaler.bookmyshowjuly24.dtos.CreateBookingResponseDto;
import com.scaler.bookmyshowjuly24.dtos.ResponseStatus;
import com.scaler.bookmyshowjuly24.models.Booking;
import com.scaler.bookmyshowjuly24.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public CreateBookingResponseDto createBooking(CreateBookingRequestDto requestDto) {
        CreateBookingResponseDto responseDto = new CreateBookingResponseDto();

        try {
            Booking booking = bookingService.createBooking(
                    requestDto.getUserId(),
                    requestDto.getShowId(),
                    requestDto.getShowSeatIds()
            );

            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setBooking(booking);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}
