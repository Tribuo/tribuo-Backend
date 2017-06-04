/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Productos;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface ProductoServices {

    /**
     *
     * @return
     */
    public List<Productos> getProductos();

    /**
     *
     * @param id
     * @return
     */
    public Productos getProductosById(int id);

    /**
     *
     * @param p
     */
    public void createProducto(Productos p);

    /**
     *
     * @param code
     * @return
     */
    public Productos getProductoByCode(String code);

}
