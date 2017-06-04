/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.controllers;

import com.tribuo.backend.jpa.Especificos;
import com.tribuo.backend.jpa.Subcategorias;
import com.tribuo.backend.services.EspecificoServices;
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
@RequestMapping("/especificos")
public class EspecificosController {
    @Autowired
    EspecificoServices se;
    
    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Especificos> getSubcategoria(@PathVariable("id") Integer id) {
        Especificos u = se.getEspecificosById(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Especificos>> getSubcategorias() {
        List<Especificos> u = se.getEspecificos();
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @param p
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Void> insertSubcategoria(@RequestBody Especificos p) {
        se.insertEspecifico(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/subcat/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Especificos>> getSubcatByCategoria(@PathVariable("id") Integer id) {
        List<Especificos> espec = se.getEspecByCategoria(id);
        return new ResponseEntity<>(espec, HttpStatus.OK);
    }
}
