/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

/**
 *
 * @author Jose Daniel
 */
@Entity
@Table(name="tiquete",uniqueConstraints=@UniqueConstraint(columnNames="titulo"))
public class Tiquete {
   
    //Creamos los atributos de la clase segun los datos del SQL DB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_tiquete")
    private Long idTiquete;
    
    @Column(name="Estado_tiquete")
    private String Estado;
    
    @Column(name="Descripción ")
    private String Descripción;
    @Column(name="Descripción ")
    
    private String titulo;
    private String edad;
    
    @ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinTable(
            name="tiquete_usuario",
            joinColumns=@JoinColumn(name="Id_tiquete",referencedColumnName="tiquete_Id"),
            inverseJoinColumns=@JoinColumn(name="rol_id",referencedColumnName="id_rol");
//Getters and Setters
    public Long getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(Long idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
//constructores
    public Tiquete(Long idTiquete, String Estado, String Descripción, String titulo, String edad, <any> ) {
        this.idTiquete = idTiquete;
        this.Estado = Estado;
        this.Descripción = Descripción;
        this.titulo = titulo;
        this.edad = edad;
        
    }

    public Tiquete(String Estado, String Descripción, String titulo, String edad, <any> ) {
        this.Estado = Estado;
        this.Descripción = Descripción;
        this.titulo = titulo;
        this.edad = edad;
  
    }
    public Tiquete(){


            }
}

