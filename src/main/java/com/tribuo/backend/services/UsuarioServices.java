/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.Usuarios;
import java.util.List;

/**
 *
 * @author 2092161
 */
public interface UsuarioServices {

    public List<Usuarios> getUsuarios();

    public Usuarios getUsuariosById(int id);
    
    public void createUsuario(Usuarios u);
    
}
