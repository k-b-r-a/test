 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k_b_r_a.portfolio.Controller;

import com.k_b_r_a.portfolio.Model.Inicio;
import com.k_b_r_a.portfolio.Service.InicioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kbra
 */
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/")

public class InicioController {
    @Autowired
    private InicioService inicioService;
    
    //cargar todos los textos
    @GetMapping("/")
    public List<Inicio> listar()
    {
        return inicioService.findAll();
    }
}
