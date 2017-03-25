/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.services;

import com.tribuo.backend.jpa.*;
import java.util.List;

/**
 *
 * @author 2092161
 */
public interface Services {
    
    public List<Categorias> getCategorias();;
    
    public List<Compras> getCompras();;
    
    public List<Fabricantes> getFabricantes();;
    
    public List<Marcas> getMarcas();;
    
    public List<Presentaciones> getPresentaciones();;
    
    public List<Productos> getProductos();;
            
    public List<Subcategorias> getSubcategorias();;
    
    public List<Sucursales> getSucursales();;
    
    public List<Tiendas> getTiendas();;
    
    public List<Usuarios> getUsuarios();;
    
    public List<Ventas> getVentas();;
    
    public Categorias getCategoriasById(int id);;
    
    public Compras getComprasById(int id);;
    
    public Fabricantes getFabricantesById(int id);;
    
    public Marcas getMarcasById(int id);;
    
    public Presentaciones getPresentacionesById(int id);
    
    public Productos getProductosById(int id);;
    
    public Subcategorias getSubcategoriaById(int id);;
    
    public Sucursales getSucursalesById(int id);;
    
    public Tiendas getTiendasById(int id);;
    
    public Usuarios getUsuariosById(int id);;
    
    public Ventas getVentasById(int id);;
    
}
