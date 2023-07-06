package com.proyectoG05.dto;

public class UsuarioDto {

    //Mismos atributos de la clase usuario
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    
    //Getters y setters de la clase
    public Long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    //Constructores de la clase
    public UsuarioDto(Long idUsuario, String nombre, String apellido, String email, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
    }
    public UsuarioDto(String nombre, String apellido, String email, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
    }
    public UsuarioDto(String email) {
        this.email = email;
    }
    public UsuarioDto() {
    }
    
}
