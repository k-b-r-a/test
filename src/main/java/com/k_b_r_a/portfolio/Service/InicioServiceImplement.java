/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k_b_r_a.portfolio.Service;
import com.k_b_r_a.portfolio.Dao.InicioDao;
import com.k_b_r_a.portfolio.Model.Inicio;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kbra
 */
@Service
public class InicioServiceImplement implements InicioService{
    @Autowired
    private InicioDao inicioDao;
    
    @Override
    public List<Inicio> findAll()
    {
        return (List<Inicio>) inicioDao.findAll();
    }
    
    @Override
    public Inicio save(Inicio inicio)
    {
        return inicioDao.save(inicio);
    }
    @Override   
    public Inicio findById(Integer id)
    {
        return inicioDao.findById(id).orElse(null);
    }
}

