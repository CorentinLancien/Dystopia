package com.dystopia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = " Joueur")
@Data
public class Joueur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "pseudo", nullable = false)
    private String pseudo;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "riotAccName", nullable = false)
    private String riotAccName;
}
