package com.api12.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client implements java.io.Serializable {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    @OneToMany
    private List <Facture> listefacture;
    @OneToMany
    private List <Commande> listeCommande;
}
