package com.ucacue.backendlibros.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("docente")
public class Docente extends Persona {
    private String titulo;
}
