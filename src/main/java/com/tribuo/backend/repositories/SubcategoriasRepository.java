/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.repositories;

import com.tribuo.backend.jpa.Subcategorias;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Camilo Aguado
 */
public interface SubcategoriasRepository extends JpaRepository<Subcategorias, Integer> {

    /**
     *
     * @param id
     * @return
     */
    @Query(value = "SELECT * FROM subcategorias WHERE categoria = :id", nativeQuery = true)
    public List<Subcategorias> getSubCatByCategoria(@Param("id") Integer id);

}
