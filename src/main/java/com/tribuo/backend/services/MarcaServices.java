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

    /**
     *
     * @return
     */
    public List<Marcas> getMarcas();

    /**
     *
     * @param id
     * @return
     */
    public Marcas getMarcasById(int id);

    /**
     *
     * @param m
     */
    public void createMarca(Marcas m);

    /**
     *
     * @param id
     * @return
     */
    public List<Marcas> getMarcasByFrabicante(int id);

}
