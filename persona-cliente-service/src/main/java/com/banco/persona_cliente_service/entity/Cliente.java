package com.banco.persona_cliente_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cliente extends Persona {

    private String contrasena;
    private boolean estado;
}
