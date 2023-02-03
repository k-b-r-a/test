/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.k_b_r_a.portfolio.Service;

import com.k_b_r_a.portfolio.Model.Img;
import java.util.List;

/**
 *
 * @author kbra
 */
public interface ImgService {
    public List<Img> findAll();
    public Img save(Img nombre);
    public Img findById(Integer id);
}
