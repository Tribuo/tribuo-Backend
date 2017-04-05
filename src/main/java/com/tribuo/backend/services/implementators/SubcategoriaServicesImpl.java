/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Subcategorias;
import com.tribuo.backend.repositories.SubcategoriasRepository;
import com.tribuo.backend.services.SubcategoriaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubcategoriaServicesImpl implements SubcategoriaServices {

    @Autowired
    SubcategoriasRepository subcatRepo;

    @Override
    public List<Subcategorias> getSubcategorias() {
        return subcatRepo.findAll();
    }

    @Override
    public Subcategorias getSubcategoriaById(int id) {
        return subcatRepo.findOne(id);
    }

    @Override
    public void createSubcategoria(Subcategorias sc) {
        subcatRepo.save(sc);
    }

}
