/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.repositories;

import com.tribuo.backend.jpa.Sucursales;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Camilo Aguado
 */
public interface SucursalesRepository extends JpaRepository<Sucursales, Integer> {
    
    @Query(value="SELECT * FROM sucursales WHERE nit = :tienda", nativeQuery = true)
    public List<Sucursales> getSucursalesByTienda(@Param("tienda")int tienda);
}
