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

    public List<Subcategorias> getSubcategorias();

    public Subcategorias getSubcategoriaById(int id);
    
    public void createSubcategoria(Subcategorias sc);

    public List<Subcategorias> getSubCatByCategoria(Integer id);

}
