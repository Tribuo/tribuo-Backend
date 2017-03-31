/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.ProductosTiendas;
import com.tribuo.backend.repositories.ProductosTiendasRepository;
import com.tribuo.backend.services.ProductoTiendaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoTiendaServicesImpl implements ProductoTiendaServices {

    @Autowired
    ProductosTiendasRepository prodTienRepo;

    @Override
    public List<ProductosTiendas> getProductosTiendas() {

        return prodTienRepo.findAll();

    }

    @Override
    public ProductosTiendas getProductoTiendaById(int tiendaId, int productoId) {
        return prodTienRepo.getProductoTiendaById(tiendaId, productoId);
    }

}
