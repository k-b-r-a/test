 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k_b_r_a.portfolio.Controller;

import com.k_b_r_a.portfolio.Model.Img;
import com.k_b_r_a.portfolio.Service.ImgService;
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
@RequestMapping("/api")

public class ImgController {
    @Autowired
    private ImgService imgService;
    
    //cargar todos los textos
    @GetMapping("/imgs")
    public List<Img> listar()
    {
        return imgService.findAll();
    }
}
