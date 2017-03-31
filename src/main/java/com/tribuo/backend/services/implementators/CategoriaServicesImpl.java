/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Categorias;
import com.tribuo.backend.repositories.CategoriasRepository;
import com.tribuo.backend.services.CategoriaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicesImpl implements CategoriaServices {

    @Autowired
    CategoriasRepository catRepo;

    @Override
    public List<Categorias> getCategorias() {
        return catRepo.findAll();
    }

    @Override
    public Categorias getCategoriasById(int id) {
        return catRepo.findOne(id);
    }

    @Override
    public void insertCategoria(Categorias categoria) {
        catRepo.save(categoria);
    }

}
