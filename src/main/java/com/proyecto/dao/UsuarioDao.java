package com.proyecto.dao;

import com.proyecto.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

    //Ejemplo 1 de un metodo utilizando metodos Query
    public Usuario findByUsername(String username);

}
