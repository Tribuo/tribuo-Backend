package com.tribuo.backend.jpa;
// Generated Apr 7, 2017 11:20:18 AM by Hibernate Tools 4.3.1


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

/**
 * Subcategorias generated by hbm2java
 */
@Entity
@Table(name="SUBCATEGORIAS"
    ,catalog="tribuo"
)
public class Subcategorias  implements java.io.Serializable {


     private int idSubcategoria;
     private Categorias categorias;
     private String nombreSubcategoria;
     private Set<Productos> productoses = new HashSet<Productos>(0);

    public Subcategorias() {
    }

	
    public Subcategorias(int idSubcategoria, Categorias categorias, String nombreSubcategoria) {
        this.idSubcategoria = idSubcategoria;
        this.categorias = categorias;
        this.nombreSubcategoria = nombreSubcategoria;
    }
    public Subcategorias(int idSubcategoria, Categorias categorias, String nombreSubcategoria, Set<Productos> productoses) {
       this.idSubcategoria = idSubcategoria;
       this.categorias = categorias;
       this.nombreSubcategoria = nombreSubcategoria;
       this.productoses = productoses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_subcategoria", nullable=false)
    public int getIdSubcategoria() {
        return this.idSubcategoria;
    }
    
    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="categoria", nullable=false)
    public Categorias getCategorias() {
        return this.categorias;
    }
    
    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    
    @Column(name="nombre_subcategoria", nullable=false, length=30)
    public String getNombreSubcategoria() {
        return this.nombreSubcategoria;
    }
    
    public void setNombreSubcategoria(String nombreSubcategoria) {
        this.nombreSubcategoria = nombreSubcategoria;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="subcategorias")
    public Set<Productos> getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }




}


