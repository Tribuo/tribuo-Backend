package com.tribuo.backend.jpa;
// Generated Mar 22, 2017 7:15:02 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Productos generated by hbm2java
 */
@Entity
@Table(name="productos"
    ,catalog="tribuo"
    , uniqueConstraints = @UniqueConstraint(columnNames="codigo_barras") 
)
public class Productos  implements java.io.Serializable {


     private Integer idProducto;
     private Marcas marcas;
     private Presentaciones presentaciones;
     private Subcategorias subcategorias;
     private String nombreProducto;
     private Integer precioSugerido;
     private String codigoBarras;
     private String descripcion;
     private String tipo;
     private Set<Ventas> ventases = new HashSet<Ventas>(0);
     private Set<Compras> comprases = new HashSet<Compras>(0);
     private Set<ProductosTiendas> productosTiendases = new HashSet<ProductosTiendas>(0);

    public Productos() {
    }

	
    public Productos(Marcas marcas, Presentaciones presentaciones, Subcategorias subcategorias, String nombreProducto, String codigoBarras, String tipo) {
        this.marcas = marcas;
        this.presentaciones = presentaciones;
        this.subcategorias = subcategorias;
        this.nombreProducto = nombreProducto;
        this.codigoBarras = codigoBarras;
        this.tipo = tipo;
    }
    public Productos(Marcas marcas, Presentaciones presentaciones, Subcategorias subcategorias, String nombreProducto, Integer precioSugerido, String codigoBarras, String descripcion, String tipo, Set<Ventas> ventases, Set<Compras> comprases, Set<ProductosTiendas> productosTiendases) {
       this.marcas = marcas;
       this.presentaciones = presentaciones;
       this.subcategorias = subcategorias;
       this.nombreProducto = nombreProducto;
       this.precioSugerido = precioSugerido;
       this.codigoBarras = codigoBarras;
       this.descripcion = descripcion;
       this.tipo = tipo;
       this.ventases = ventases;
       this.comprases = comprases;
       this.productosTiendases = productosTiendases;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_producto", unique=true, nullable=false)
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="marca", nullable=false)
    public Marcas getMarcas() {
        return this.marcas;
    }
    
    public void setMarcas(Marcas marcas) {
        this.marcas = marcas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tipo_presentacion", nullable=false)
    public Presentaciones getPresentaciones() {
        return this.presentaciones;
    }
    
    public void setPresentaciones(Presentaciones presentaciones) {
        this.presentaciones = presentaciones;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="subcategoria", nullable=false)
    public Subcategorias getSubcategorias() {
        return this.subcategorias;
    }
    
    public void setSubcategorias(Subcategorias subcategorias) {
        this.subcategorias = subcategorias;
    }

    
    @Column(name="nombre_producto", nullable=false, length=20)
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    
    @Column(name="precio_sugerido")
    public Integer getPrecioSugerido() {
        return this.precioSugerido;
    }
    
    public void setPrecioSugerido(Integer precioSugerido) {
        this.precioSugerido = precioSugerido;
    }

    
    @Column(name="codigo_barras", unique=true, nullable=false, length=20)
    public String getCodigoBarras() {
        return this.codigoBarras;
    }
    
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    
    @Column(name="descripcion", length=200)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="tipo", nullable=false, length=30)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="productos")
    public Set<Ventas> getVentases() {
        return this.ventases;
    }
    
    public void setVentases(Set<Ventas> ventases) {
        this.ventases = ventases;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="productos")
    public Set<Compras> getComprases() {
        return this.comprases;
    }
    
    public void setComprases(Set<Compras> comprases) {
        this.comprases = comprases;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="productos")
    public Set<ProductosTiendas> getProductosTiendases() {
        return this.productosTiendases;
    }
    
    public void setProductosTiendases(Set<ProductosTiendas> productosTiendases) {
        this.productosTiendases = productosTiendases;
    }




}


