/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k_b_r_a.portfolio.Service;
import com.k_b_r_a.portfolio.Dao.NombreDao;
import com.k_b_r_a.portfolio.Model.Nombre;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kbra
 */
@Service
public class NombreServiceImplement implements NombreService{
    @Autowired
    private NombreDao nombreDao;
    
    @Override
    public List<Nombre> findAll()
    {
        return (List<Nombre>) nombreDao.findAll();
    }
    
    @Override
    public Nombre save(Nombre nombre)
    {
        return nombreDao.save(nombre);
    }
    @Override   
    public Nombre findById(Integer id)
    {
        return nombreDao.findById(id).orElse(null);
    }
    
    @Override
    public void delete(Integer id)
    {
        nombreDao.deleteById(id);
    }
}

