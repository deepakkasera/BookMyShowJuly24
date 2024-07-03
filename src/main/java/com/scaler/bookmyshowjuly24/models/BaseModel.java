package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment.
    private Long id;
    private Date createdAt;
    private Date lastModifiedAt;
}


/*

ORM -> Object Relational Mapping.

Hibernate.

Provides us an easy way to interact with Database.

Converting classes into corresponding table in the DB.
Auto generation of SQL queries.

 */
