/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Presentaciones;
import com.tribuo.backend.repositories.PresentacionesRepository;
import com.tribuo.backend.services.PresentacionServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Camilo Aguado
 */
@Service
public class PresentacionServicesImpl implements PresentacionServices {

    @Autowired
    PresentacionesRepository presRepo;

    /**
     *
     * @return
     */
    @Override
    public List<Presentaciones> getPresentaciones() {
        return presRepo.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Presentaciones getPresentacionesById(int id) {
        return presRepo.findOne(id);
    }

    /**
     *
     * @param p
     */
    @Override
    public void createPresentacion(Presentaciones p) {
        presRepo.save(p);
    }

}
