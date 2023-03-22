package com.dystopia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.dystopia.dao.JoueurDao;
import com.dystopia.model.Joueur;

@Service
public class AuthService {
    
    @Autowired
    private JoueurDao daoJoueur;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public Joueur save(Joueur joueur){
        Joueur entryJoueur = new Joueur();

        entryJoueur.setPseudo(joueur.getPseudo());
        entryJoueur.setPassword(passwordEncoder.encode(joueur.getPassword()));
        return this.daoJoueur.save(entryJoueur);
    }

    public Joueur login(Joueur joueur){
        Joueur entryJoueur = this.daoJoueur.findByPseudo(joueur.getPseudo());
        entryJoueur = Optional.ofNullable(entryJoueur)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "les données de connexion sont invalides"));
        if(!passwordEncoder.matches(joueur.getPassword(), entryJoueur.getPassword())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "les données de connexion sont invalides");
        }
        return joueur;
    }
}
