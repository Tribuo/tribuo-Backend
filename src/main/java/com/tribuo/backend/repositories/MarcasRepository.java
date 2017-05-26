/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.repositories;

import com.tribuo.backend.jpa.Marcas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Camilo Aguado
 */
public interface MarcasRepository extends JpaRepository<Marcas, Integer> {
@Query(value="SELECT * FROM marcas WHERE fabricante = :id", nativeQuery = true)
    public List<Marcas> getMarcasByFabricantes(@Param("id")int fabricante);
}
