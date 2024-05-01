package com.api12.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;

import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "facture")
@Data
public class Facture implements java.io.Serializable {
    @Id
    private long id;
    private String ref;
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Client client;
}
