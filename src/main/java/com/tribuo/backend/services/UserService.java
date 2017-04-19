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

    public List<User> getUsuarios();

    public User getUsuariosById(int id);

    public void createUsuario(User u);

   // public boolean existeCorreo(String email);

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
