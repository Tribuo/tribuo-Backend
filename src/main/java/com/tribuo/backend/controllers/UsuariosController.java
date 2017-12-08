/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.User;
import com.tribuo.backend.services.*;
import java.security.Principal;
import java.util.List;
import org.opensaml.saml.saml2.metadata.EmailAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Camilo Aguado
 */
@RestController
@RequestMapping("/usuarios")

public class UsuariosController {

    @Autowired
    UserService se;

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<User> getUsuario(@PathVariable("id") Integer id) {
        User u = se.getUsuariosById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<User>> getUsuarios() {
        List<User> u = se.getUsuarios();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @param p
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertUsuario(@RequestBody User p) {
        se.createUsuario(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/existe/{correo:.+}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Boolean> existeUsuario(@PathVariable("correo") String usuario) {

        return new ResponseEntity<>(se.userExistByEmail(usuario), HttpStatus.OK);
    }

    @RequestMapping("/user")
    public Principal sayHello(Principal principal) {
        return principal;
    }

    @RequestMapping(value = "/email/{correo:.+}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<User> getUsuarioByEmail(@PathVariable("correo") String usuario) {

        return new ResponseEntity<>(se.findUserByEmail(usuario), HttpStatus.OK);
    }
}
