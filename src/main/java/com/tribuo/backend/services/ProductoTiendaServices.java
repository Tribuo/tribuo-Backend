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
 * @author Camilo Aguado
 */
public interface ProductoTiendaServices {

    /**
     *
     * @return
     */
    public List<ProductosTiendas> getProductosTiendas();

    /**
     *
     * @param tiendaId
     * @param productoId
     * @return
     */
    public ProductosTiendas getProductoTiendaById(int tiendaId, int productoId);

    public Integer getProductoPrecioByTienda(int tiendaId, int productoId);

    /**
     *
     * @param pt
     */
    public void createProductoTienda(ProductosTiendas pt);

    /**
     *
     * @param sucurusal
     * @param produto
     * @param precio
     */
    public void updateProdTiendaPrecio(int sucurusal, int produto, int precio);

    /**
     *
     * @param sucurusal
     * @param produto
     * @param cantidad
     */
    public void updateProdTiendaCantidad(int sucurusal, int produto, int cantidad);

    public List<ProductosTiendas> getAllProductosByTienda(Integer sucursal);
}
