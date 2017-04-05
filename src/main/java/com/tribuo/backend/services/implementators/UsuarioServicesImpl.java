/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import com.tribuo.backend.jpa.Usuarios;
import com.tribuo.backend.repositories.UsuariosRepository;
import com.tribuo.backend.services.UsuarioServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicesImpl implements UsuarioServices {

    @Autowired
    UsuariosRepository usuRepo;

    @Override
    public List<Usuarios> getUsuarios() {
        return usuRepo.findAll();
    }

    @Override
    public Usuarios getUsuariosById(int id) {
        return usuRepo.findOne(id);
    }

    @Override
    public void createUsuario(Usuarios u) {
        usuRepo.save(u);
    }

}
