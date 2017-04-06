/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.ProductosTiendas;
import com.tribuo.backend.services.ProductoTiendaServices;
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
 * @author Camilo Aguado
 */
@RestController
@RequestMapping("/prodtienda")
public class ProductosTiendasController {

    @Autowired
    ProductoTiendaServices se;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<ProductosTiendas>> getProductosTiendas() {
        List<ProductosTiendas> u = se.getProductosTiendas();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(value = "/{idTienda}-{idProducto}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ProductosTiendas> getProductoTiendaById(@PathVariable("idTienda") Integer idTienda, @PathVariable("idProducto") Integer idProducto) {
        ProductosTiendas u = se.getProductoTiendaById(idTienda, idProducto);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
    
}
