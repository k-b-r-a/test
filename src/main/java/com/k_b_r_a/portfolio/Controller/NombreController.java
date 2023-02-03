 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k_b_r_a.portfolio.Controller;

import com.k_b_r_a.portfolio.Model.Nombre;
import com.k_b_r_a.portfolio.Service.NombreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

public class NombreController {
    @Autowired
    private NombreService nombreService;
    
    //lsitar
    @GetMapping("/nombres")
    public List<Nombre> listar()
    {
        return nombreService.findAll();
    }
    
    //guardar
    @PostMapping("/nombres")
    public Nombre guardar(@RequestBody Nombre nombre)
    {
        return nombreService.save(nombre);
    }
    
    //get nombre
    @GetMapping("/nombres/{id}")
    public Nombre getUnNombre(@PathVariable Integer id)
    {
        return nombreService.findById(id);
    }
    //Modificar
    @PutMapping("/nombres/{id}")
    public Nombre modificar(@RequestBody Nombre nombre,@PathVariable Integer id)
    {
        Nombre nombreActual= nombreService.findById(id);
        nombreActual.setNombre(nombre.getNombre());
        nombreActual.setApellido(nombre.getApellido());
        nombreActual.setEmail(nombre.getEmail());
        nombreActual.setMessage(nombre.getMessage());
        return nombreService.save(nombreActual);
    }
    
    @DeleteMapping("/nombres/{id}")
    public void eliminar(@PathVariable Integer id)
    {
         nombreService.delete(id);
    }
}
