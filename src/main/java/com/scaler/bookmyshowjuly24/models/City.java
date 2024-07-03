package com.scaler.bookmyshowjuly24.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class City extends BaseModel {
    private String name;
    private String pinCode;
    private List<Theatre> theatres;
}
