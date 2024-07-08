package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String name; //A1, D2,
    private int rowNum;
    private int colNum;

    @ManyToOne
    private SeatType seatType;

    //private Status status; -> Status shouldn't be a part of seat, it should be part of Show + Seat.
}

/*

 1            1
Seat ---- SeatType => M:1
  M           1
 */