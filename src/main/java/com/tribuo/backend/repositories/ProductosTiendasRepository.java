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
public interface ProductosTiendasRepository extends JpaRepository<ProductosTiendas, ProductosTiendasId>{
    
   @Query(value = "SELECT * FROM productos_tiendas WHERE nit_sucursal = :idTienda AND id_producto = :idProducto", nativeQuery = true)
   ProductosTiendas getProductoTiendaById(@Param("idTienda")int idTienda, @Param("idProducto")int idProducto);
}
