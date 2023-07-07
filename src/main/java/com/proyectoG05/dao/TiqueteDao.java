/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoG05.dao;

import com.proyectoG05.domain.Tiquete;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jose Daniel
 */
public interface TiqueteDao extends JpaRepository <Tiquete,Long> {
     public boolean isActivo();
}
