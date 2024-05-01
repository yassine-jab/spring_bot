package com.api12.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
@Entity
@Table(name="categorie")
@Data
public class Categorie implements Serializable {
    @Id
    private long id;
private String nom;
private Date date_creation;
private Date date_modification;
    @OneToMany
private List<Produit> produits;


}
