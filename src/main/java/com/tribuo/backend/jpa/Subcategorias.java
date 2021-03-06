package com.tribuo.backend.jpa;
// Generated Oct 28, 2017 12:35:33 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
 * Subcategorias generated by hbm2java
 */
@Entity
@Table(name = "subcategorias",
         catalog = "tribuo",
         uniqueConstraints = @UniqueConstraint(columnNames = {"categoria", "nombre_subcategoria"})
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Subcategorias implements java.io.Serializable {

    private Integer idSubcategoria;
    private Categorias categorias;
    private String nombreSubcategoria;
    private Set<Especificos> especificoses = new HashSet<Especificos>(0);

    public Subcategorias() {
    }

    public Subcategorias(Categorias categorias, String nombreSubcategoria) {
        this.categorias = categorias;
        this.nombreSubcategoria = nombreSubcategoria;
    }

    public Subcategorias(Categorias categorias, String nombreSubcategoria, Set<Especificos> especificoses) {
        this.categorias = categorias;
        this.nombreSubcategoria = nombreSubcategoria;
        this.especificoses = especificoses;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id_subcategoria", unique = true, nullable = false)
    public Integer getIdSubcategoria() {
        return this.idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoria", nullable = false)
    public Categorias getCategorias() {
        return this.categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    @Column(name = "nombre_subcategoria", nullable = false, length = 30)
    public String getNombreSubcategoria() {
        return this.nombreSubcategoria;
    }

    public void setNombreSubcategoria(String nombreSubcategoria) {
        this.nombreSubcategoria = nombreSubcategoria;
    }

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "subcategorias")
    public Set<Especificos> getEspecificoses() {
        return this.especificoses;
    }

    public void setEspecificoses(Set<Especificos> especificoses) {
        this.especificoses = especificoses;
    }

}
