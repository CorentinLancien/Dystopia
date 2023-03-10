package com.dystopia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dystopia.model.Joueur;
import com.dystopia.service.JoueurService;

@RestController
@RequestMapping({"/api/joueur"})
@CrossOrigin
public class JoueurController {
    
    @Autowired
    private JoueurService srvJoueur;

    @GetMapping("")
    public List<Joueur> findAll(){
        return this.srvJoueur.findAll();
    }
}
