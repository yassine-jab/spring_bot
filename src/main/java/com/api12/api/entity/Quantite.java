package com.api12.api.entity;

import jakarta.persistence.*;


public class Quantite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    @ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Produit produit;

    @ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Commande commande;

}
