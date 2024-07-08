package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;

    @OneToMany
    private List<Screen> screens;

    @ManyToOne
    private City city;
}
