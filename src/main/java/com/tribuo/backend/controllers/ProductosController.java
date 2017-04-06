/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Productos;
import com.tribuo.backend.services.ProductoServices;
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
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    ProductoServices se;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Productos> getProducto(@PathVariable("id") Integer id) {
        Productos u = se.getProductosById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Productos>> getProductos() {
        List<Productos> u = se.getProductos();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/codigo/{code}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Productos> getOPriductoByCode(@PathVariable("code") String code){
        Productos p = se.getProductoByCode(code);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertProducto(@RequestBody Productos p) {
        se.createProducto(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
