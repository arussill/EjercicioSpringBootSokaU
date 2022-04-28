package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioRolService {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    public ArrayList<UsuarioRolModel> obtenerRolesDeUsuarios() {
        return (ArrayList<UsuarioRolModel>) usuarioRolRepository.findAll();
    }

    public UsuarioRolModel guardarRol(UsuarioRolModel rol) {
        return usuarioRolRepository.save(rol);
    }

    public Optional<UsuarioRolModel> rolPorId(Long id_rol) {
        return usuarioRolRepository.findById(id_rol);
    }

    public boolean eliminarRol(Long id_rol) {
        try {
            usuarioRolRepository.deleteById(id_rol);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
