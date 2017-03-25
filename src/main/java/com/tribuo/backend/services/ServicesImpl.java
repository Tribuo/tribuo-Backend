/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.*;
import com.tribuo.backend.repositories.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesImpl implements Services {

    @Autowired
    CategoriasRepository catRepo;

    @Autowired
    ComprasRepository compRepo;

    @Autowired
    FabricantesRepository fabRepo;

    @Autowired
    MarcasRepository marcaRepo;

    @Autowired
    PresentacionesRepository presRepo;

    @Autowired
    ProductosRepository prodRepo;

    @Autowired
    SubcategoriasRepository subcatRepo;

    @Autowired
    SucursalesRepository sucuRepo;

    @Autowired
    TiendasRepository tienRepo;

    @Autowired
    UsuariosRepository usuRepo;

    @Autowired
    VentasRepository ventRepo;

    @Override
    public List<Categorias> getCategorias() {
        return catRepo.findAll();
    }

    @Override
    public List<Compras> getCompras() {
        return compRepo.findAll();
    }

    @Override
    public List<Fabricantes> getFabricantes() {
        return fabRepo.findAll();
    }

    @Override
    public List<Marcas> getMarcas() {
        return marcaRepo.findAll();
    }

    @Override
    public List<Presentaciones> getPresentaciones() {
        return presRepo.findAll();
    }

    @Override
    public List<Productos> getProductos() {
        return prodRepo.findAll();
    }

    @Override
    public List<Subcategorias> getSubcategorias() {
        return subcatRepo.findAll();
    }

    @Override
    public List<Sucursales> getSucursales() {
        return sucuRepo.findAll();
    }

    @Override
    public List<Tiendas> getTiendas() {
        return tienRepo.findAll();
    }

    @Override
    public List<Usuarios> getUsuarios() {
        return usuRepo.findAll();
    }

    @Override
    public List<Ventas> getVentas() {
        return ventRepo.findAll();
    }

    @Override
    public Categorias getCategoriasById(int id) {
        return catRepo.findOne(id);
    }

    @Override
    public Compras getComprasById(int id) {
        return compRepo.findOne(id);
    }

    @Override
    public Fabricantes getFabricantesById(int id) {
        return fabRepo.findOne(id);
    }

    @Override
    public Marcas getMarcasById(int id) {
        return marcaRepo.findOne(id);
    }

    @Override
    public Presentaciones getPresentacionesById(int id) {
        return presRepo.findOne(id);
    }

    @Override
    public Productos getProductosById(int id) {
        return prodRepo.findOne(id);
    }

    @Override
    public Subcategorias getSubcategoriaById(int id) {
        return subcatRepo.findOne(id);
    }

    @Override
    public Sucursales getSucursalesById(int id) {
        return sucuRepo.findOne(id);
    }

    @Override
    public Tiendas getTiendasById(int id) {
        return tienRepo.findOne(id);
    }

    @Override
    public Usuarios getUsuariosById(int id) {
        return usuRepo.findOne(id);
    }

    @Override
    public Ventas getVentasById(int id) {
        return ventRepo.findOne(id);
    }

}
