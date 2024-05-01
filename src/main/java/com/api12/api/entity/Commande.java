package com.api12.api.entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Entity
public class Commande implements Serializable {
        @Id
        private Long id;

        @ManyToOne
        private Client client;
        private Date dateCommande;
        private double montantTotal;

}
