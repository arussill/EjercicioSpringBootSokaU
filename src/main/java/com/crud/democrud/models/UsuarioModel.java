package com.crud.democrud.models;

import javax.persistence.*;


@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String email;
    private Integer prioridad;

    //    Relacion con tabla rol
    @ManyToOne(optional = false)
    @JoinColumn(name="usuarioRol")
    private UsuarioRolModel roles;

    //    Constructor

    public UsuarioModel(Long id, String nombre, String email, Integer prioridad, UsuarioRolModel roles) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
        this.roles = roles;
    }

    public UsuarioModel() {

    }


//    Getters and Setters

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UsuarioRolModel getRoles() {
        return roles;
    }

    public void setRoles(UsuarioRolModel roles) {
        this.roles = roles;
    }
}
