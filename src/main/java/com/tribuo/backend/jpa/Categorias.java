package com.tribuo.backend.jpa;
// Generated Mar 22, 2017 7:15:02 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Categorias generated by hbm2java
 */
@Entity
@Table(name="categorias"
    ,catalog="tribuo"
    , uniqueConstraints = @UniqueConstraint(columnNames="nombre_categoria") 
)
public class Categorias  implements java.io.Serializable {


     private int idCategoria;
     private String nombreCategoria;
     private Set<Subcategorias> subcategoriases = new HashSet<Subcategorias>(0);

    public Categorias() {
    }

	
    public Categorias(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }
    public Categorias(int idCategoria, String nombreCategoria, Set<Subcategorias> subcategoriases) {
       this.idCategoria = idCategoria;
       this.nombreCategoria = nombreCategoria;
       this.subcategoriases = subcategoriases;
    }
   
     @Id 

    
    @Column(name="id_categoria", unique=true, nullable=false)
    public int getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    
    @Column(name="nombre_categoria", unique=true, nullable=false, length=30)
    public String getNombreCategoria() {
        return this.nombreCategoria;
    }
    
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="categorias")
    public Set<Subcategorias> getSubcategoriases() {
        return this.subcategoriases;
    }
    
    public void setSubcategoriases(Set<Subcategorias> subcategoriases) {
        this.subcategoriases = subcategoriases;
    }




}


