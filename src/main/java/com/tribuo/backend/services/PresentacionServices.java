/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Presentaciones;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface PresentacionServices {

    public List<Presentaciones> getPresentaciones();

    public Presentaciones getPresentacionesById(int id);
    
    public void createPresentacion(Presentaciones p);

}
