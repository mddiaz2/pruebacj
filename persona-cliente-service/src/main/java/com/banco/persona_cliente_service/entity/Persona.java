package com.banco.persona_cliente_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Persona {

    @Id
    private String identificacion;

    private String nombre;
    private String genero;
    private int edad;
    private String direccion;
    private String telefono;
}