package com.mx.Usuario.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Usuario.Dominio.Rol;

@Repository
public interface RolDao extends JpaRepository<Rol, Integer>{

}
