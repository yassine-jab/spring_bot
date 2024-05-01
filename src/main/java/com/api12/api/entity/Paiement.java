package com.api12.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name="Paiement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Paiement {
    @Id
    private int id;
    private long montant;
    private Date date_paiement;
    private String statue_paiement;
    private String type_paiement;
    private Client client;
    private Facture facture;


}
