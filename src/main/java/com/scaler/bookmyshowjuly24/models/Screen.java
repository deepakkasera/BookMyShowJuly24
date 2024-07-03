package com.scaler.bookmyshowjuly24.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel {
    private String name;
    private List<Seat> seats;
    private List<Feature> features; // 2D, 3D, 4D, IMAX
}
