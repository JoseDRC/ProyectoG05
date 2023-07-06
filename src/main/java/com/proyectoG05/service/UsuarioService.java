package com.proyectoG05.service;

import com.proyectoG05.domain.Usuario;
import com.proyectoG05.dto.UsuarioDto;

public interface UsuarioService {
    
    public Usuario save(UsuarioDto registroDto);
}
