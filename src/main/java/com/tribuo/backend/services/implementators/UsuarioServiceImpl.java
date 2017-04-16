/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services.implementators;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tribuo.backend.jpa.Role;
import com.tribuo.backend.jpa.User;

import com.tribuo.backend.repositories.RoleRepository;
import com.tribuo.backend.repositories.UserRepository;
import com.tribuo.backend.services.UserService;

@Service
public class UsuarioServiceImpl implements UserService {

    @Autowired
    UserRepository usuRepo;

    @Autowired
    RoleRepository roleRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<User> getUsuarios() {
        return usuRepo.findAll();
    }

    @Override
    public User getUsuariosById(int id) {
        return usuRepo.findOne(id);
    }

    @Override
    public void createUsuario(User u) {
        usuRepo.save(u);
    }

    /**@Override
    public boolean existeCorreo(String usuario) {
        return usuRepo.existeCorreo(usuario) != 0;
    }**/

    @Override
	public User findUserByEmail(String email) {
		return usuRepo.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepo.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		usuRepo.save(user);
	}

}
