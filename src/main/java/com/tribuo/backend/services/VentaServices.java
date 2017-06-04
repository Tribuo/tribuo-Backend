/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Ventas;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface VentaServices {

    /**
     *
     * @return
     */
    public List<Ventas> getVentas();

    /**
     *
     * @param id
     * @return
     */
    public Ventas getVentasById(int id);

    /**
     *
     * @param venta
     */
    public void registerVenta(Ventas venta);

}
