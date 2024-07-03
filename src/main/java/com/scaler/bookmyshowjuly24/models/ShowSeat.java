package com.scaler.bookmyshowjuly24.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends BaseModel {
    private Show show;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
}
