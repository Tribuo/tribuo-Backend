package com.tribuo.backend.jpa;
// Generated Apr 14, 2017 8:01:04 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Compras generated by hbm2java
 */
@Entity
@Table(name="compras"
    ,catalog="tribuo"
)
public class Compras  implements java.io.Serializable {


     private Integer idCompra;
     private Productos productos;
     private Sucursales sucursales;
     private int precioUnidad;
     private int cantidad;
     private Date fecha;

    public Compras() {
    }

    public Compras(Productos productos, Sucursales sucursales, int precioUnidad, int cantidad, Date fecha) {
       this.productos = productos;
       this.sucursales = sucursales;
       this.precioUnidad = precioUnidad;
       this.cantidad = cantidad;
       this.fecha = fecha;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_compra", unique=true, nullable=false)
    public Integer getIdCompra() {
        return this.idCompra;
    }
    
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_producto", nullable=false)
    public Productos getProductos() {
        return this.productos;
    }
    
    public void setProductos(Productos productos) {
        this.productos = productos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nit_sucursal", nullable=false)
    public Sucursales getSucursales() {
        return this.sucursales;
    }
    
    public void setSucursales(Sucursales sucursales) {
        this.sucursales = sucursales;
    }

    
    @Column(name="precio_unidad", nullable=false)
    public int getPrecioUnidad() {
        return this.precioUnidad;
    }
    
    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    
    @Column(name="cantidad", nullable=false)
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha", nullable=false, length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


