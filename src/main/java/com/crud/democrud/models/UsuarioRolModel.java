package com.crud.democrud.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rol")
public class UsuarioRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_rol;

    private String rol;
    private String descripcion;

//    Relacion entre tablas

    @ManyToMany(mappedBy = "rol")
    private Set<UsuarioModel> usuario;

//    Getters and Setters

    public Long getIdRol() {
        return id_rol;
    }

    public void setIdRol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getRoll() {
        return rol;
    }

    public void setRoll(String rol) {
        this.rol = rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
