package com.example.askri.amanikomutel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactsDTO {
    private Long id;
    private String nom;
    private  String adresse;
    private  String ville;
    private  String pays;
    private  String telephone;
    private  String debutContrat;
}
