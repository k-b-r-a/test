/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k_b_r_a.portfolio.Service;
import com.k_b_r_a.portfolio.Dao.ImgDao;
import com.k_b_r_a.portfolio.Model.Img;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kbra
 */
@Service
public class ImgServiceImplement implements ImgService{
    @Autowired
    private ImgDao inicioDao;
    
    @Override
    public List<Img> findAll()
    {
        return (List<Img>) inicioDao.findAll();
    }
    
    @Override
    public Img save(Img inicio)
    {
        return inicioDao.save(inicio);
    }
    @Override   
    public Img findById(Integer id)
    {
        return inicioDao.findById(id).orElse(null);
    }
}

