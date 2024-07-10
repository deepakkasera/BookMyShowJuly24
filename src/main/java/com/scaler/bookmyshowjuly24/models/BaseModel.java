package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment.
    private Long id;

    @CreatedDate
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @LastModifiedDate
    @Temporal(TemporalType.DATE)
    private Date lastModifiedAt;
}


/*

ORM -> Object Relational Mapping.

Hibernate.

Provides us an easy way to interact with Database.

Converting classes into corresponding table in the DB.
Auto generation of SQL queries.

 */
