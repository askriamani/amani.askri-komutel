package com.example.askri.amanikomutel.model;






import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
@Getter
@Setter
public class Contacts {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private  String adresse;
    private  String ville;
    private  String pays;
    private  String telephone;
    private  String debutContrat;
}
