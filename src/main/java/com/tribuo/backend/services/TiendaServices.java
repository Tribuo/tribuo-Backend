/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Tiendas;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface TiendaServices {

    /**
     *
     * @return
     */
    public List<Tiendas> getTiendas();

    /**
     *
     * @param id
     * @return
     */
    public Tiendas getTiendasById(int id);

    /**
     *
     * @param t
     */
    public void createTienda(Tiendas t);

    /**
     *
     * @param t
     */
    public void deleteTienda(Tiendas t);
}
