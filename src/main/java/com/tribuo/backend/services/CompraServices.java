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
 * @author 2092161
 */
public interface CompraServices {

    public List<Compras> getCompras();

    public Compras getComprasById(int id);

}
