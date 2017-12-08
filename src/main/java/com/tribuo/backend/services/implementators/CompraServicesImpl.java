/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Compras;
import com.tribuo.backend.jpa.Productos;
import com.tribuo.backend.jpa.ProductosTiendas;
import com.tribuo.backend.jpa.Sucursales;
import com.tribuo.backend.repositories.ComprasRepository;
import com.tribuo.backend.repositories.ProductosTiendasRepository;
import com.tribuo.backend.services.CompraServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Camilo Aguado
 */
@Service
public class CompraServicesImpl implements CompraServices {

    @Autowired
    ComprasRepository compRepo;
    @Autowired
    ProductosTiendasRepository prodTienRepo;

    /**
     *
     * @return
     */
    @Override
    public List<Compras> getCompras() {
        return compRepo.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Compras getComprasById(int id) {
        return compRepo.findOne(id);
    }

    /**
     *
     * @param compra
     */
    @Override
    public void registerCompra(Compras compra) {
        compRepo.save(compra);
        Sucursales s = compra.getSucursales();
        Productos p = compra.getProductos();
        ProductosTiendas pt;
        try {
            pt = prodTienRepo.getProductoTiendaById(s.getIdSucursal(), p.getIdProducto());
            pt.setCantidad(pt.getCantidad() + compra.getCantidad());
        } catch (Exception e) {
            pt = new ProductosTiendas(p, s, compra.getCantidad(), 0);
        }
        prodTienRepo.save(pt);
    }

}
