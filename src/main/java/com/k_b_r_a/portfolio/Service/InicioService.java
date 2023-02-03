/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.k_b_r_a.portfolio.Service;

import com.k_b_r_a.portfolio.Model.Inicio;
import java.util.List;

/**
 *
 * @author kbra
 */
public interface InicioService {
    public List<Inicio> findAll();
    public Inicio save(Inicio nombre);
    public Inicio findById(Integer id);
}
