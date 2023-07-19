package com.example.eventflow.usuario;

import java.util.List;

import com.example.eventflow.event.Event;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id
   
    private Long id;
    
    private String name;
    private String email;

    @OneToMany(mappedBy="usuario") 
    private List<Event> events;
}
 

