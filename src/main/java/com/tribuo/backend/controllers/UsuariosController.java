/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Usuarios;
import com.tribuo.backend.services.*;
import java.util.List;
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
    UsuarioServices se;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Usuarios> getUsuario(@PathVariable("id") Integer id) {
        Usuarios u = se.getUsuariosById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Usuarios>> getUsuarios() {
        List<Usuarios> u = se.getUsuarios();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertUsuario(@RequestBody Usuarios p) {
        se.createUsuario(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/existe/{username}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Boolean> existeUsuario(@PathVariable("username") String usuario) {
        return new ResponseEntity<>(se.existeUsuario(usuario), HttpStatus.OK);
    }
}
