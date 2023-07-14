package com.ucacue.backendlibros.model;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("estudiante")
@Data
public class Estudiante extends Persona {

    private String carrera;
}
