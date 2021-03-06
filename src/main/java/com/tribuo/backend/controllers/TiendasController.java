/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Tiendas;
import com.tribuo.backend.services.TiendaServices;
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
@RequestMapping("/tiendas")
public class TiendasController {

    @Autowired
    TiendaServices se;

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Tiendas> getTienda(@PathVariable("id") Integer id) {
        Tiendas u = se.getTiendasById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Tiendas>> getTiendas() {
        List<Tiendas> u = se.getTiendas();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @param p
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertTienda(@RequestBody Tiendas p) {
        se.createTienda(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Tiendas>> getTiendasByUser(@PathVariable("id") Integer id) {
        List<Tiendas> u = se.getTiendasByUser(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
}
