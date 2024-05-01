package com.api12.api.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name="cart_credit")
@Data
@AllArgsConstructor
public class cart_credit extends Paiement {
    @Id
    private long id;

    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;
    public int getId() {
        return super.getId();
    }
}
