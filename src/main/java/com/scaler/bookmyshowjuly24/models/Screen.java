package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;

    @OneToMany
    @JoinColumn(name = "seat_id")
    private List<Seat> seats;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features; // 2D, 3D, 4D, IMAX
}


/*
   1          M
Screen ----- Seat => 1:M
  1            1
 */