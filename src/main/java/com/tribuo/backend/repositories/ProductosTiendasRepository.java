/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.repositories;

import com.tribuo.backend.jpa.ProductosTiendas;
import com.tribuo.backend.jpa.ProductosTiendasId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author 2092161
 */
public interface ProductosTiendasRepository extends JpaRepository<ProductosTiendas, ProductosTiendasId> {

    @Query(value = "SELECT * FROM productos_tiendas WHERE nit_sucursal = :idTienda AND id_producto = :idProducto", nativeQuery = true)
    public ProductosTiendas getProductoTiendaById(@Param("idTienda") int idTienda, @Param("idProducto") int idProducto);

    @Query(value = "UPDATE productos_tiendas"
            + "SET cantidad = :cantidad"
            + "WHERE nit_sucursal = :sucursal AND id_producto = :producto", nativeQuery = true)
    public void updateProductoTiendaCantidad(@Param("sucursal") int nitSucursal, @Param("producto") int ipProducto, @Param("cantidad") int cantidad);

    @Query(value = "UPDATE productos_tiendas"
            + "SET precio = :precio"
            + "WHERE nit_sucursal = :sucursal AND id_producto = :producto", nativeQuery = true)
    public void updateProductoTiendaPrecio(@Param("sucursal") int nitSucursal, @Param("producto") int ipProducto, @Param("precio") int precio);
}
