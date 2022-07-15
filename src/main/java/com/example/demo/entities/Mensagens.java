package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mensagens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMensagem;
    private String mensagem;

    @ManyToOne
    // Coloque o nome no seu atributo com o mesmo nome do atributo que estamos
    // fazendo o relacionamento em JoinColumn
    @JoinColumn(name = "idCampanha")
    private Campanhas idCampanha;

    public Mensagens() {
    }

    public Mensagens(Integer idMensagem, String mensagem, Campanhas idCampanha) {
        this.idMensagem = idMensagem;
        this.mensagem = mensagem;
        this.idCampanha = idCampanha;
    }

    public Integer getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(Integer idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Campanhas getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(Campanhas idCampanha) {
        this.idCampanha = idCampanha;
    }

    @Override
    public String toString() {
        return "Mensagens [idCampanha=" + idCampanha + ", idMensagem=" + idMensagem + ", mensagem=" + mensagem + "]";
    }

}
