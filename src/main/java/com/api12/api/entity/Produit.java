package com.api12.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="produit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String description;
    private long prix;
    private int stock;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Categorie categorie;
    @OneToMany
    private List<Quantite> quantiteList;
}
