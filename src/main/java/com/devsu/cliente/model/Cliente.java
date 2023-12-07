package com.devsu.usuarios.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "cliente")
public class Cliente extends Persona {
    @Column(name = "clienteId")
    private String clienteId;
    @Column(name = "contrasena")
    private String contraseña;

    @Column(name = "estado")
    private String estado;

    // Constructor, Getter and Setter

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(this.clienteId, cliente.clienteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clienteId);
    }
}
