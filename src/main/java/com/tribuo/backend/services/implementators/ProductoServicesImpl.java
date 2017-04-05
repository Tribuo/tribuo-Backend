/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Productos;
import com.tribuo.backend.repositories.ProductosRepository;
import com.tribuo.backend.services.ProductoServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicesImpl implements ProductoServices {

    @Autowired
    ProductosRepository prodRepo;

    @Override
    public List<Productos> getProductos() {
        return prodRepo.findAll();
    }

    @Override
    public Productos getProductosById(int id) {
        return prodRepo.findOne(id);
    }

    @Override
    public void createProducto(Productos p) {
        prodRepo.save(p);
    }

    @Override
    public Productos getProductoByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
