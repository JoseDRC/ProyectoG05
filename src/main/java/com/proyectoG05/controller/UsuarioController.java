package com.proyectoG05.controller;

import com.proyectoG05.dto.UsuarioDto;
import com.proyectoG05.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @ModelAttribute("usuario")
    public UsuarioDto retornarNuevoUsuario(){
        return new UsuarioDto();
    }
    
    @GetMapping
    public String mostrarFormularioRegistro(){
        return "registro";
    }
    
    @PostMapping
    public String registrarCuentaUsuario(@ModelAttribute("usuario") UsuarioDto registroDto){
        usuarioService.save(registroDto);
        return "redirect:/registro?exito";
    }
}
