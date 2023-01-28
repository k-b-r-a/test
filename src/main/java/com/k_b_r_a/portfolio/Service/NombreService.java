/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.k_b_r_a.portfolio.Service;

import com.k_b_r_a.portfolio.Model.Nombre;
import java.util.List;

/**
 *
 * @author kbra
 */
public interface NombreService {
    public List<Nombre> findAll();
    public Nombre save(Nombre nombre);
    public Nombre findById(Integer id);
    public void delete(Integer id);
}
