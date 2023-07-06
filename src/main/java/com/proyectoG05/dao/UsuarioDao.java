package com.proyectoG05.dao;

import com.proyectoG05.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario,Long>{
    
}
