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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kbra
 */
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")

public class InicioController {
    @Autowired
    private InicioService inicioService;
    
    //cargar todos los textos
    @GetMapping("/texts")
    public List<Inicio> listar()
    {
        return inicioService.findAll();
    }
    @PutMapping("/texts/{id}")
    public Inicio modificar(@RequestBody Inicio inicio,@PathVariable Integer id)
    {
        Inicio inicioActual= inicioService.findById(id);
        inicioActual.setNombre(inicio.getNombre());
        inicioActual.setMessage(inicio.getMessage());
        return inicioService.save(inicioActual);
    }
}
