package com.proyectoG05.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.Collection;

@Entity
@Table(name="usuarios",uniqueConstraints=@UniqueConstraint(columnNames="email"))
public class Usuario {
    
    //Creamos los atributos de la clase segun los datos del SQL DB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long idUsuario;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    private String email;
    private String contrasena;
    
    @ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinTable(
            name="roles_usuario",
            joinColumns=@JoinColumn(name="usuario_id",referencedColumnName="id_usuario"),
            inverseJoinColumns=@JoinColumn(name="rol_id",referencedColumnName="id_rol")
    )
    private Collection<Rol> roles;

    //Getters y setters de los campos determinadso
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
    public Collection<Rol> getRoles() {
        return roles;
    }
    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    //Constructores de la clase para hacer uso de la misma
    public Usuario(Long idUsuario, String nombre, String apellido, String email, String contrasena, Collection<Rol> roles) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.roles = roles;
    }
    public Usuario(String nombre, String apellido, String email, String contrasena, Collection<Rol> roles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.roles = roles;
    }
    public Usuario() {
    }
}
