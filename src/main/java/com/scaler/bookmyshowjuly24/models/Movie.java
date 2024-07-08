package com.scaler.bookmyshowjuly24.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "movies")
public class Movie extends BaseModel {
    private String name;
}
