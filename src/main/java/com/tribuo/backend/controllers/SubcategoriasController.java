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
@RequestMapping("/subcategorias")
public class SubcategoriasController {

    @Autowired
    SubcategoriaServices se;

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Subcategorias> getSubcategoria(@PathVariable("id") Integer id) {
        Subcategorias u = se.getSubcategoriaById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Subcategorias>> getSubcategorias() {
        List<Subcategorias> u = se.getSubcategorias();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @param p
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertSubcategoria(@RequestBody Subcategorias p) {
        se.createSubcategoria(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/categoria/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Subcategorias>> getSubcatByCategoria(@PathVariable("id") Integer id) {
        List<Subcategorias> marcas = se.getSubCatByCategoria(id);
        return new ResponseEntity<>(marcas, HttpStatus.OK);
    }
}
