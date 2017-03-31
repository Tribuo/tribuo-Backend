/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Subcategorias;
import com.tribuo.backend.services.SubcategoriaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2092161
 */
@RestController
@RequestMapping("/subcategorias")
public class SubcategoriasConotroller {

    @Autowired
    SubcategoriaServices se;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Subcategorias> getSubcategoria(@PathVariable("id") Integer id) {
        Subcategorias u = se.getSubcategoriaById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Subcategorias>> getSubcategorias() {
        List<Subcategorias> u = se.getSubcategorias();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
}
