package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.UsuarioRolService;
import com.crud.democrud.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/rol")
public class UsuarioRolController {
    @Autowired
    UsuarioRolService usuarioRolService;

    @GetMapping()
    public ArrayList<UsuarioRolModel> obtenerRolesDeUsuarios() {
        return usuarioRolService.obtenerRolesDeUsuarios();
    }

    @PostMapping()
    public UsuarioRolModel guardarRol(@RequestBody UsuarioRolModel rol) {
        return this.usuarioRolService.guardarRol(rol);
    }

    @GetMapping(path = "/{id_rol}")
    public Optional<UsuarioRolModel> rolPorId(@PathVariable("id_rol") Long id_rol) {
        return this.usuarioRolService.rolPorId(id_rol);
    }

    @DeleteMapping(path = "/{id_rol}")
    public String eliminarPorId(@PathVariable("id_rol") Long id_rol) {
        boolean ok = this.usuarioRolService.eliminarRol(id_rol);
        if (ok) {
            return "Se eliminó el rol con id " + id_rol;
        } else {
            return "No pudo eliminar el rol con id" + id_rol;
        }
    }

    @PutMapping(path ="/actualizar")
    public UsuarioRolModel actualizarRol(@RequestBody UsuarioRolModel rol) {
        return this.usuarioRolService.guardarRol(rol);
    }

}
