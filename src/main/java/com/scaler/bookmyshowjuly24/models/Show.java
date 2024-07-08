package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "shows")
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Screen screen;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features; // 2D, DOLBY

    private String language;

    @Enumerated(EnumType.ORDINAL)
    private ShowStatus showStatus;
}

/*
  1          1
Show ------ Movie => M:1
  M           1

  1         1
Show ---- Screen => M:1
  M          1



 */
