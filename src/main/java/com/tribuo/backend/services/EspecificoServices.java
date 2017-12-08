/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Especificos;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface EspecificoServices {

    /**
     *
     * @return
     */
    public List<Especificos> getEspecificos();

    /**
     *
     * @param id
     * @return
     */
    public Especificos getEspecificosById(int id);

    /**
     *
     * @param especifico
     */
    public void insertEspecifico(Especificos especifico);

    public List<Especificos> getEspecByCategoria(Integer id);

}
