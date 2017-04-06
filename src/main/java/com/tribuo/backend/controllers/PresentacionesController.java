/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Presentaciones;
import com.tribuo.backend.services.PresentacionServices;
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
@RequestMapping("/presentaciones")
public class PresentacionesController {

    @Autowired
    PresentacionServices se;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Presentaciones> getPresentacion(@PathVariable("id") Integer id) {
        Presentaciones u = se.getPresentacionesById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Presentaciones>> getPresentaciones() {
        List<Presentaciones> u = se.getPresentaciones();
        return new ResponseEntity<>(u, HttpStatus.OK);

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertPresentacion(@RequestBody Presentaciones p) {
        se.createPresentacion(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
