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
 * @author 2092161
 */
public interface FabricanteServices {

    public List<Fabricantes> getFabricantes();

    public Fabricantes getFabricantesById(int id);
    
    public void createFabricante(Fabricantes fab);

}
