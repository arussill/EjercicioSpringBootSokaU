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
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "usuario_rol",unique = true)
    private Set<UsuarioModel> id;

    //    Constructores
    public UsuarioRolModel() {

    }

    public UsuarioRolModel(Long id_rol, String rol, String descripcion) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.descripcion = descripcion;
    }
//    Getters and Setters

    public Long getIdRol() {
        return id_rol;
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

    public Set<UsuarioModel> getId() {
        return id;
    }

    public void setId(Set<UsuarioModel> id) {
        this.id = id;
    }
}
