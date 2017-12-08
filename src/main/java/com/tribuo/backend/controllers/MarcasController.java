/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Marcas;
import com.tribuo.backend.services.MarcaServices;
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
@RequestMapping("/marcas")
public class MarcasController {

    @Autowired
    MarcaServices se;

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Marcas> getUsuario(@PathVariable("id") Integer id) {
        Marcas u = se.getMarcasById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Marcas>> getUsuarios() {
        List<Marcas> m = se.getMarcas();
        return new ResponseEntity<>(m, HttpStatus.OK);
    }

    /**
     *
     * @param marca
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertMarca(@RequestBody Marcas marca) {
        se.createMarca(marca);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/fabricante/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Marcas>> getMarcasByFabricante(@PathVariable("id") Integer id) {
        List<Marcas> marcas = se.getMarcasByFrabicante(id);
        return new ResponseEntity<>(marcas, HttpStatus.OK);
    }
}
