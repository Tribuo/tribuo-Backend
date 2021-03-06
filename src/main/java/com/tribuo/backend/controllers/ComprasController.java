/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Compras;
import com.tribuo.backend.services.CompraServices;
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
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    CompraServices se;

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Compras> getCompra(@PathVariable("id") Integer id) {
        Compras u = se.getComprasById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Compras>> getCompras() {
        List<Compras> u = se.getCompras();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @param compra
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertCompra(@RequestBody Compras compra) {
        se.registerCompra(compra);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
