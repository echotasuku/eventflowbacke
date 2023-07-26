package com.example.eventflow.event;

import java.time.LocalDate;
import java.time.LocalTime;


import com.example.eventflow.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

 
    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    private String title;
    private LocalDate date_event;
    private LocalTime time_event;
    private String location;
    private String description;
    private String photo;

  
    
}
