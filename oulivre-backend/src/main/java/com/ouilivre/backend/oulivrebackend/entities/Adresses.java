package com.ouilivre.backend.oulivrebackend.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Adresses {
    @Id
    @GeneratedValue
    private long idAdresses;
    private String adresse1;
    private String adresse2;
    private long codePostal=99999;
    private String ville;
    private String pays;

}