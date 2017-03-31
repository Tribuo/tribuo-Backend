/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Tiendas;
import com.tribuo.backend.repositories.TiendasRepository;
import com.tribuo.backend.services.TiendaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiendaServicesImpl implements TiendaServices {

    @Autowired
    TiendasRepository tienRepo;

    @Override
    public List<Tiendas> getTiendas() {
        return tienRepo.findAll();
    }

    @Override
    public Tiendas getTiendasById(int id) {
        return tienRepo.findOne(id);
    }

}
