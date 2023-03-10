package com.dystopia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dystopia.dao.JoueurDao;
import com.dystopia.model.Joueur;

@Service
public class JoueurService {
    
    @Autowired
    private JoueurDao daoJoueur;

    public List<Joueur> findAll(){
        return this.daoJoueur.findAll();
    }
}
