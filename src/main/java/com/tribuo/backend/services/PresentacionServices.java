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

    /**
     *
     * @return
     */
    public List<Presentaciones> getPresentaciones();

    /**
     *
     * @param id
     * @return
     */
    public Presentaciones getPresentacionesById(int id);

    /**
     *
     * @param p
     */
    public void createPresentacion(Presentaciones p);

}
