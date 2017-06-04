/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.User;
import java.util.List;

/**
 *
 * @author Camilo Aguado
 */
public interface UserService {

    /**
     *
     * @return
     */
    public List<User> getUsuarios();

    /**
     *
     * @param id
     * @return
     */
    public User getUsuariosById(int id);

    /**
     *
     * @param u
     */
    public void createUsuario(User u);

    // public boolean existeCorreo(String email);

    /**
     *
     * @param email
     * @return
     */
    public User findUserByEmail(String email);

    /**
     *
     * @param user
     */
    public void saveUser(User user);
}
