/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Compras;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface CompraServices {

    /**
     *
     * @return
     */
    public List<Compras> getCompras();

    /**
     *
     * @param id
     * @return
     */
    public Compras getComprasById(int id);

    /**
     *
     * @param compra
     */
    public void registerCompra(Compras compra);
}
