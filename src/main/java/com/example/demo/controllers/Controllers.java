package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Campanhas;
import com.example.demo.entities.Mensagens;
import com.example.demo.services.Services;

@RestController
@RequestMapping("/campanhas")
public class Controllers {

    @Autowired
    private Services services;

    @PostMapping("/criarCampanhas")
    public ResponseEntity<Campanhas> criarCamp(@RequestBody Campanhas camp) {
        camp = services.criarCamp(camp);
        return ResponseEntity.ok().body(camp);
    }

    @PostMapping("/criarMensagem")
    public ResponseEntity<Mensagens> criarMensagem(@RequestBody Mensagens mensg) {
        mensg = services.criarMensagem(mensg);
        return ResponseEntity.ok().body(mensg);
    }
}
