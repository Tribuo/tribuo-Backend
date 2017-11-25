package com.tribuo.backend.jpa;
// Generated Oct 28, 2017 12:35:33 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Categorias generated by hbm2java
 */
@Entity
@Table(name = "categorias",
        catalog = "tribuo",
        uniqueConstraints = @UniqueConstraint(columnNames = "nombre_categoria")
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Categorias implements java.io.Serializable {

    private Integer idCategoria;
    private String nombreCategoria;
    private Set<Subcategorias> subcategoriases = new HashSet<Subcategorias>(0);

    public Categorias() {
    }

    public Categorias(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Categorias(String nombreCategoria, Set<Subcategorias> subcategoriases) {
        this.nombreCategoria = nombreCategoria;
        this.subcategoriases = subcategoriases;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id_categoria", unique = true, nullable = false)
    public Integer getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Column(name = "nombre_categoria", unique = true, nullable = false, length = 30)
    public String getNombreCategoria() {
        return this.nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @JsonIgnore    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "categorias")
    public Set<Subcategorias> getSubcategoriases() {
        return this.subcategoriases;
    }

    public void setSubcategoriases(Set<Subcategorias> subcategoriases) {
        this.subcategoriases = subcategoriases;
    }

}
