/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.repositories;

import com.tribuo.backend.jpa.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Camilo Aguado
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {

    /**
     *
     * @param role
     * @return
     */
    Role findByRole(String role);
}
