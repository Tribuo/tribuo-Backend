/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.ProductosTiendas;
import java.util.List;

/**
 *
 * @author 2092161
 */
public interface ProductoTiendaServices {

    public List<ProductosTiendas> getProductosTiendas();

    public ProductosTiendas getProductoTiendaById(int tiendaId, int productoId);

    public void createProductoTienda(ProductosTiendas pt);

    public void updateProdTiendaPrecio(int sucurusal, int produto, int precio);
    
    public void updateProdTiendaCantidad(int sucurusal, int produto, int cantidad);
}
