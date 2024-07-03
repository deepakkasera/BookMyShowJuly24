package com.scaler.bookmyshowjuly24.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel {
    private String name; //A1, D2,
    private int row;
    private int col;
    private SeatType seatType;

    //private Status status; -> Status shouldn't be a part of seat, it should be part of Show + Seat.
}
