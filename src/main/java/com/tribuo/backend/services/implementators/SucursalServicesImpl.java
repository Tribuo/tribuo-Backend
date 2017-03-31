/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Sucursales;
import com.tribuo.backend.repositories.SucursalesRepository;
import com.tribuo.backend.services.SucursalServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalServicesImpl implements SucursalServices {

    @Autowired
    SucursalesRepository sucuRepo;

    @Override
    public List<Sucursales> getSucursales() {
        return sucuRepo.findAll();
    }

    @Override
    public Sucursales getSucursalesById(int id) {
        return sucuRepo.findOne(id);
    }

}
