package com.proyectoG05.service.impl;

import com.proyectoG05.dao.UsuarioDao;
import com.proyectoG05.domain.Rol;
import com.proyectoG05.domain.Usuario;
import com.proyectoG05.dto.UsuarioDto;
import com.proyectoG05.service.UsuarioService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    private UsuarioDao usuarioDao;
    
    @Override
    public Usuario save(UsuarioDto registroDto){
        Usuario usuario = new Usuario(registroDto.getNombre(),registroDto.getApellido(),
                registroDto.getEmail(),registroDto.getContrasena(),Arrays.asList(new Rol("ROLE_USER")));
        return usuarioDao.save(usuario);
    }
}
