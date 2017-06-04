/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Productos;
import com.tribuo.backend.jpa.ProductosTiendas;
import com.tribuo.backend.jpa.ProductosTiendasId;
import com.tribuo.backend.jpa.Sucursales;
import com.tribuo.backend.jpa.Ventas;
import com.tribuo.backend.repositories.ProductosTiendasRepository;
import com.tribuo.backend.repositories.VentasRepository;
import com.tribuo.backend.services.VentaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Camilo Aguado
 */
@Service
public class VentaServicesImpl implements VentaServices {

    @Autowired
    VentasRepository ventRepo;

    @Autowired
    ProductosTiendasRepository prodTienRepo;

    /**
     *
     * @return
     */
    @Override
    public List<Ventas> getVentas() {
        return ventRepo.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Ventas getVentasById(int id) {
        return ventRepo.findOne(id);
    }

    /**
     *
     * @param venta
     */
    @Override
    public void registerVenta(Ventas venta) {
        Productos p = venta.getProductos();
        Sucursales s = venta.getSucursales();
        ProductosTiendasId ptid = new ProductosTiendasId(p.getIdProducto(), s.getIdSucursal());
        if (!prodTienRepo.exists(ptid)) {
            ProductosTiendas pt = prodTienRepo.findOne(ptid);
            pt.setCantidad(pt.getCantidad() - venta.getCantidad());
        }

    }
}
