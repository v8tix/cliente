package com.devsu.cliente.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Objects;


@MappedSuperclass
public class Persona extends BaseModel {
    @Column(name = "nombre")
    protected String nombre;

    @Column(name = "genero")
    protected String genero;

    @Column(name = "edad")
    protected int edad;

    @Column(name = "identificacion", unique = true)
    protected String identificacion;
    @Column(name = "direccion")
    protected String direccion;
    @Column(name = "telefono")
    protected String telefono;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(identificacion, persona.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacion);
    }
}

