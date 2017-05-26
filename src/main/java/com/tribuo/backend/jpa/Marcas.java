package com.tribuo.backend.jpa;
// Generated Apr 14, 2017 8:01:04 PM by Hibernate Tools 4.3.1

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
 * Marcas generated by hbm2java
 */
@Entity
@Table(name = "marcas", catalog = "tribuo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"nombre_marca", "fabricante"}),
    @UniqueConstraint(columnNames = "nombre_marca")}
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Marcas implements java.io.Serializable {

    private Integer idMarca;
    private Fabricantes fabricantes;
    private String nombreMarca;
    private Set<Productos> productoses = new HashSet<Productos>(0);

    public Marcas() {
    }

    public Marcas(Fabricantes fabricantes, String nombreMarca) {
        this.fabricantes = fabricantes;
        this.nombreMarca = nombreMarca;
    }

    public Marcas(Fabricantes fabricantes, String nombreMarca, Set<Productos> productoses) {
        this.fabricantes = fabricantes;
        this.nombreMarca = nombreMarca;
        this.productoses = productoses;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id_marca", unique = true, nullable = false)
    public Integer getIdMarca() {
        return this.idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fabricante", nullable = false)
    public Fabricantes getFabricantes() {
        return this.fabricantes;
    }

    public void setFabricantes(Fabricantes fabricantes) {
        this.fabricantes = fabricantes;
    }

    @Column(name = "nombre_marca", unique = true, nullable = false, length = 30)
    public String getNombreMarca() {
        return this.nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "marcas")
    public Set<Productos> getProductoses() {
        return this.productoses;
    }

    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }

}
