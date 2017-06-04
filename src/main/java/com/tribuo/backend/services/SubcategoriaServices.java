/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Subcategorias;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface SubcategoriaServices {

    /**
     *
     * @return
     */
    public List<Subcategorias> getSubcategorias();

    /**
     *
     * @param id
     * @return
     */
    public Subcategorias getSubcategoriaById(int id);

    /**
     *
     * @param sc
     */
    public void createSubcategoria(Subcategorias sc);

    /**
     *
     * @param id
     * @return
     */
    public List<Subcategorias> getSubCatByCategoria(Integer id);

}
