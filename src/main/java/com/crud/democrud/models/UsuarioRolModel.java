package com.crud.democrud.models;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "rol")
public class UsuarioRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String rol;
    private String descripcion;

    //    Constructores
    public UsuarioRolModel() {

    }

    public UsuarioRolModel(Long id, String rol, String descripcion) {
        this.id = id;
        this.rol = rol;
        this.descripcion = descripcion;
    }
//    Getters and Setters

    public Long getIdRol() {
        return id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId_rol() {
        return id;
    }

    public void setId_rol(Long id) {
        this.id = id;
    }

}
