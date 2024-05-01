package com.api12.api.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="espece")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
    public class Espece extends Paiement {

        @Id
        private long id;
        private String devise;
        private double montantRemis;
    public int getId() {
        return super.getId();
    }
}
