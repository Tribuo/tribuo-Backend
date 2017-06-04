/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Categorias;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface CategoriaServices {

    /**
     *
     * @return
     */
    public List<Categorias> getCategorias();

    /**
     *
     * @param id
     * @return
     */
    public Categorias getCategoriasById(int id);

    /**
     *
     * @param categoria
     */
    void insertCategoria(Categorias categoria);

}
