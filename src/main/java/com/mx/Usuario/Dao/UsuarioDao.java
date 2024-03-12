package com.mx.Usuario.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Usuario.Dominio.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

}
