/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Ventas;
import com.tribuo.backend.services.VentaServices;
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
@RequestMapping("/ventas")
public class VentasController {

    @Autowired
    VentaServices se;

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Ventas> getVenta(@PathVariable("id") Integer id) {
        Ventas u = se.getVentasById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Ventas>> getVentas() {
        List<Ventas> u = se.getVentas();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
    
    /**
     *
     * @param p
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertUsuario(@RequestBody Ventas p) {
        se.registerVenta(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
