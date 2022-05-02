package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioRolServiceTest {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    @Test
    public void testGuardarRol(){
        UsuarioRolModel usuarioRolModel = new UsuarioRolModel(1L,"Comprador","Cliente");
        UsuarioRolModel rol_registrado = usuarioRolRepository.save(usuarioRolModel);
        assertNotNull(rol_registrado);
    }

    @Test
    public void testBuscarRolPorId(){
        Long idRol=1L;
        Optional<UsuarioRolModel> usuarioRolModelFind=usuarioRolRepository.findById(idRol);
        assertThat(usuarioRolModelFind.get().getIdRol()).isEqualTo(idRol);
    }
}

