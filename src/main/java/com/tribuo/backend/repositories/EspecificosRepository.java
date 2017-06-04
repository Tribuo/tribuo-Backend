/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.repositories;

import com.tribuo.backend.jpa.Especificos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Camilo Aguado
 */
public interface EspecificosRepository extends JpaRepository<Especificos, Integer> {

    /**
     *
     * @param id
     * @return
     */
    @Query(value = "SELECT * FROM especificos WHERE subcategoria = :id", nativeQuery = true)
    public List<Especificos> getEspecBySubcat(@Param("id") Integer id);

}
