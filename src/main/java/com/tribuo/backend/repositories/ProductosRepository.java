/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.repositories;

import com.tribuo.backend.jpa.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author 2092161
 */
public interface ProductosRepository extends JpaRepository<Productos, Integer> {
    
    @Query(value = "SELECT * FROM productos WHERE codigoBarras = :code", nativeQuery = true)
    public Productos getProductoByCode(@Param(":code")String code);
}
