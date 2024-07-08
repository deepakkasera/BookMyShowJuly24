package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel {
    private String name;
    private String pinCode;

//    @OneToMany
//    private List<Theatre> theatres;
}

/*
  1           M
City  ----- Theatre => 1:M
  1            1
 */
