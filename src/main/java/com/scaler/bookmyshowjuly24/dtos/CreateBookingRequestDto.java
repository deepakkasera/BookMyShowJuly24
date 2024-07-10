package com.scaler.bookmyshowjuly24.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateBookingRequestDto {
    private Long userId;
    private Long showId;
    private List<Long> showSeatIds;
}
