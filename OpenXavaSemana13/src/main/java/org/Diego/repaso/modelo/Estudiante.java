package org.Diego.repaso.modelo;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Estudiante {
    @Id
    @Column(length = 8)
    String cif;
    
    @Column(length = 30)
    String nombre;
    
    @Column(length = 50)
    String carrera;

    @Size(min = 10, message = "El email debe tener al menos 10 caracteres")
    @javax.validation.constraints.Email(message = "El formato del email es incorrecto")
    String email;
}
