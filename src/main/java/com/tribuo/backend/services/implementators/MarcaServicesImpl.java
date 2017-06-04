/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Marcas;
import com.tribuo.backend.repositories.MarcasRepository;
import com.tribuo.backend.services.MarcaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Camilo Aguado
 */
@Service
public class MarcaServicesImpl implements MarcaServices {

    @Autowired
    MarcasRepository marcaRepo;

    /**
     *
     * @return
     */
    @Override
    public List<Marcas> getMarcas() {
        return marcaRepo.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Marcas getMarcasById(int id) {
        return marcaRepo.findOne(id);
    }

    /**
     *
     * @param m
     */
    @Override
    public void createMarca(Marcas m) {
        marcaRepo.save(m);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public List<Marcas> getMarcasByFrabicante(int id) {
        return marcaRepo.getMarcasByFabricantes(id);
    }
}
