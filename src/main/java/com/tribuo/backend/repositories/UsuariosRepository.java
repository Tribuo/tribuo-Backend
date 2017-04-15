/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.repositories;

import com.tribuo.backend.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Camilo Aguado
 */
public interface UsuariosRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT COUNT(email) FROM user WHERE email = :correo",nativeQuery = true)
    Integer findByUsername(@Param("correo")String usuario);
}
