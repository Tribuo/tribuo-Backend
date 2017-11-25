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
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Camilo Aguado
 */
@Service("userService")
public class UsuarioServiceImpl implements UserService {

    @Autowired
    UserRepository usuRepo;

    @Autowired
    RoleRepository roleRepo;

    @Bean
    @Override
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     *
     * @return
     */
    @Override
    public List<User> getUsuarios() {
        return usuRepo.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public User getUsuariosById(int id) {
        return usuRepo.findOne(id);
    }

    /**
     *
     * @param u
     */
    @Override
    public void createUsuario(User u) {
        usuRepo.save(u);
    }

    /**
     * @param email
     * @return
     * @Override public boolean existeCorreo(String usuario) { return
     * usuRepo.existeCorreo(usuario) != 0; }*
     */
    @Override
    public User findUserByEmail(String email) {
        return usuRepo.findByEmail(email);
    }

    /**
     *
     * @param user
     */
    @Override
    public void saveUser(User user) {
        user.setActive(1);
        Role userRole = roleRepo.findByRole("ADMIN");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
        usuRepo.save(user);
    }

    @Override
    public void save(User user) {
        user.setPassword(getPasswordEncoder().encode(user.getPassword()));
        usuRepo.save(user);
    }

    @Override
    public boolean userExistByEmail(String email) {
        User u = usuRepo.findByEmail(email);
        return null != u;
    }
}
