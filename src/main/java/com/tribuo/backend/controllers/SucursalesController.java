/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Sucursales;
import com.tribuo.backend.services.SucursalServices;
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
@RequestMapping("/sucursales")
public class SucursalesController {

    @Autowired
    SucursalServices se;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Sucursales> getSucursale(@PathVariable("id") Integer id) {
        Sucursales u = se.getSucursalesById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Sucursales>> getSucursales() {
        List<Sucursales> u = se.getSucursales();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertSucursal(@RequestBody Sucursales p) {
        se.createSucursal(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
