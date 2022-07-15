package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Campanhas;
import com.example.demo.entities.Mensagens;
import com.example.demo.repository.CampanhasJPA;
import com.example.demo.repository.MensagensJPA;

@Service
public class Services {

    @Autowired
    private CampanhasJPA campJPA;

    @Autowired
    private MensagensJPA mensgJPA;

    public Mensagens criarMensagem(Mensagens mensg) {
        return mensgJPA.save(mensg);
    }

    public Campanhas criarCamp(Campanhas camp) {
        return campJPA.save(camp);
    }
}
