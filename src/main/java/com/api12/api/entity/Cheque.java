package com.api12.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name="cheque")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cheque {
    @Id
    private int id;
    private String banque_emetrice;
    private Date Date_emission;
    private Date Date_encaissement;

}
