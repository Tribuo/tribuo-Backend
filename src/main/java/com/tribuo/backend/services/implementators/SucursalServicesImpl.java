/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.*;
import com.tribuo.backend.repositories.SucursalesRepository;
import com.tribuo.backend.repositories.TiendasRepository;
import com.tribuo.backend.repositories.UserRepository;
import com.tribuo.backend.services.SucursalServices;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Camilo Aguado
 */
@Service
public class SucursalServicesImpl implements SucursalServices {

    @Autowired
    SucursalesRepository sucuRepo;
    
    @Autowired
    TiendasRepository tiendasRepo;
    
    @Autowired
    UserRepository usuRepo;

    /**
     *
     * @return
     */
    @Override
    public List<Sucursales> getSucursales() {
        return sucuRepo.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Sucursales getSucursalesById(int id) {
        return sucuRepo.findOne(id);
    }

    /**
     *
     * @param tienda
     * @return
     */
    @Override
    public List<Sucursales> getSucursalesByTienda(int tienda) {
        return sucuRepo.getSucursalesByTienda(tienda);
    }

    /**
     *
     * @param s
     */
    @Override
    public void createSucursal(Sucursales s) {
        if(s.getTiendas()!= null){
            Tiendas t = s.getTiendas();
            if(t.getUser()!= null){
                User u = t.getUser();
                usuRepo.save(u);
                
            }
            Set<Sucursales> set = new HashSet<>();
            t.setSucursaleses(set);
            tiendasRepo.save(t);
            
        }
        sucuRepo.save(s);
    }

    /**
     *
     * @param s
     */
    @Override
    public void deleteSucursal(Sucursales s) {
        sucuRepo.delete(s);
    }

}
