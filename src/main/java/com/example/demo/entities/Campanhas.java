package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Campanhas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCampanha;
    private String nomeCampanha;

    // na volta, nós pegamos o nome do atributo da classe Mensagens que é do tipo
    // Campanhas, nesse caso: "idCampanha"
    @OneToMany(mappedBy = "idCampanha")
    private List<Mensagens> mensagens;

    public Campanhas() {
    }

    public Campanhas(Integer idCampanha, String nomeCampanha, List<Mensagens> mensagens) {
        this.idCampanha = idCampanha;
        this.nomeCampanha = nomeCampanha;
        this.mensagens = mensagens;
    }

    public Integer getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(Integer idCampanha) {
        this.idCampanha = idCampanha;
    }

    public String getNomeCampanha() {
        return nomeCampanha;
    }

    public void setNomeCampanha(String nomeCampanha) {
        this.nomeCampanha = nomeCampanha;
    }

    public List<Mensagens> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagens> mensagens) {
        this.mensagens = mensagens;
    }

    @Override
    public String toString() {
        return "Campanhas [idCampanha=" + idCampanha + ", mensagens=" + mensagens + ", nomeCampanha=" + nomeCampanha
                + "]";
    }

}
