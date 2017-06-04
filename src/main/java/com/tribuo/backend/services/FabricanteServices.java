/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Fabricantes;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface FabricanteServices {

    /**
     *
     * @return
     */
    public List<Fabricantes> getFabricantes();

    /**
     *
     * @param id
     * @return
     */
    public Fabricantes getFabricantesById(int id);

    /**
     *
     * @param fab
     */
    public void createFabricante(Fabricantes fab);

}
