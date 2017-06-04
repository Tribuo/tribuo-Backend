/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Especificos;
import com.tribuo.backend.repositories.EspecificosRepository;
import com.tribuo.backend.services.EspecificoServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Camilo Aguado
 */
@Service
public class EspecificoServicesImpl implements EspecificoServices {

    @Autowired
    EspecificosRepository especRepo;
    
    

    @Override
    public List<Especificos> getEspecificos() {
        return especRepo.findAll();
    }

    @Override
    public Especificos getEspecificosById(int id) {
        return especRepo.findOne(id);
    }

    @Override
    public void insertEspecifico(Especificos especifico) {
        especRepo.save(especifico);
    }

    @Override
    public List<Especificos> getEspecByCategoria(Integer id) {
return especRepo.getEspecBySubcat(id);    }

}
