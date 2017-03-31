/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Ventas;
import com.tribuo.backend.repositories.VentasRepository;
import com.tribuo.backend.services.VentaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServicesImpl implements VentaServices {

    @Autowired
    VentasRepository ventRepo;

    @Override
    public List<Ventas> getVentas() {
        return ventRepo.findAll();
    }

    @Override
    public Ventas getVentasById(int id) {
        return ventRepo.findOne(id);
    }
}
