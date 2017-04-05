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
 * @author 2092161
 */
public interface SucursalServices {

    public List<Sucursales> getSucursales();

    public Sucursales getSucursalesById(int id);

    public List<Sucursales> getSucursalesByTienda(int tienda);
    
    public void createSucursal(Sucursales s);
    
    public void deleteSucursal(Sucursales s);
}
