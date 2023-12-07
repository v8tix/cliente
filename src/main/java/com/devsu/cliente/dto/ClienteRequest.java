package com.devsu.cliente.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteRequest {

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("genero")
    private String genero;

    @JsonProperty("edad")
    private int edad;

    @JsonProperty("identificacion")
    private String identificacion;

    @JsonProperty("direccion")
    private String direccion;

    @JsonProperty("telefono")
    private String telefono;

    @JsonProperty("contrasena")
    private String contrasena;

    @JsonProperty("estado")
    private String estado;
}
