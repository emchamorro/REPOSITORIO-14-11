package org.Diego.repaso.modelo;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class libro {
 
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Hidden
    private String idLibro;
    
    @Column(length = 50)
    private String titulo;
    
    @Column(length = 50)
    private String autor;
    
    @Column(length = 10)
    private LocalDate añoPublicacion;
}

