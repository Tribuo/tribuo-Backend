/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Fabricantes;
import com.tribuo.backend.repositories.FabricantesRepository;
import com.tribuo.backend.services.FabricanteServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FabricanteServicesImpl implements FabricanteServices {

    @Autowired
    FabricantesRepository fabRepo;

    @Override
    public List<Fabricantes> getFabricantes() {
        return fabRepo.findAll();
    }

    @Override
    public Fabricantes getFabricantesById(int id) {
        return fabRepo.findOne(id);
    }

}
