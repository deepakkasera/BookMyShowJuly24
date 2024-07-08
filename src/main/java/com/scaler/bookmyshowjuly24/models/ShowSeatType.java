package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//TODO
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private SeatType seatType;

    private int price;
}
