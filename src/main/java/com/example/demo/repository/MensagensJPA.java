package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Mensagens;

public interface MensagensJPA extends JpaRepository<Mensagens, Integer> {

}
