/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.ProductosTiendas;
import com.tribuo.backend.jpa.ProductosTiendasId;
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

    @Override
    public void createProductoTienda(ProductosTiendas pt) {
        prodTienRepo.save(pt);
    }

    @Override
    public void updateProdTiendaPrecio(int sucurusal, int produto, int precio) {
        ProductosTiendasId ptID = new ProductosTiendasId(sucurusal, produto);
        ProductosTiendas pt = prodTienRepo.findOne(ptID);
        pt.setPrecio(precio);
        prodTienRepo.save(pt);
    }

    @Override
    public void updateProdTiendaCantidad(int sucurusal, int produto, int cantidad) {
        ProductosTiendasId ptID = new ProductosTiendasId(sucurusal, produto);
        ProductosTiendas pt = prodTienRepo.findOne(ptID);
        pt.setPrecio(cantidad);
        prodTienRepo.save(pt);
    }

}
