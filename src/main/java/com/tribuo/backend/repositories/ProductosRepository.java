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
 * @author Camilo Aguado
 */
public interface ProductosRepository extends JpaRepository<Productos, Integer> {

    /**
     *
     * @param code
     * @return
     */
    @Query(value = "SELECT * FROM productos WHERE codigo_barras = :code", nativeQuery = true)
    public Productos getProductoByCode(@Param("code") String code);
}
