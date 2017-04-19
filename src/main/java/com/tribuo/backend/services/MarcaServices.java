/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Marcas;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface MarcaServices {

    public List<Marcas> getMarcas();

    public Marcas getMarcasById(int id);
    
    public void createMarca(Marcas m);

}
