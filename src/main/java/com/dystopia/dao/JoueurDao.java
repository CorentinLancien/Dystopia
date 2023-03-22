package com.dystopia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dystopia.model.Joueur;

public interface JoueurDao extends JpaRepository<Joueur, Integer>{
    public Joueur findByPseudo(String pseudo);
}
