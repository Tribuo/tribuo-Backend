/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.repositories;

import com.tribuo.backend.jpa.Fabricantes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Camilo Aguado
 */
public interface FabricantesRepository extends JpaRepository<Fabricantes, Integer> {

}
