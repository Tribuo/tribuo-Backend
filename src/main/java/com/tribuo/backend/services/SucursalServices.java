/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Sucursales;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface SucursalServices {

    /**
     *
     * @return
     */
    public List<Sucursales> getSucursales();

    /**
     *
     * @param id
     * @return
     */
    public Sucursales getSucursalesById(int id);

    /**
     *
     * @param tienda
     * @return
     */
    public List<Sucursales> getSucursalesByTienda(int tienda);

    /**
     *
     * @param s
     */
    public void createSucursal(Sucursales s);

    /**
     *
     * @param s
     */
    public void deleteSucursal(Sucursales s);
}
