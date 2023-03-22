package com.dystopia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dystopia.model.Joueur;
import com.dystopia.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {
    
    @Autowired
    private AuthService srvAuth;

    @PostMapping("/register")
    public Joueur register(@RequestBody Joueur joueur){
        return this.srvAuth.save(joueur);
    }

    @PostMapping("/login")
    public Joueur login(@RequestBody Joueur joueur){
        return this.srvAuth.login(joueur);
    }
}
