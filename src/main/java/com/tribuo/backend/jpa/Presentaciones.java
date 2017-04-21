package com.tribuo.backend.jpa;
// Generated Apr 14, 2017 8:01:04 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Presentaciones generated by hbm2java
 */
@Entity
@Table(name = "presentaciones", catalog = "tribuo", uniqueConstraints = @UniqueConstraint(columnNames = {"cantidad", "unidad_medida"})
)
public class Presentaciones implements java.io.Serializable {

    private Integer idPresentacion;
    private int cantidad;
    private String unidadMedida;
    private Set<Productos> productoses = new HashSet<Productos>(0);

    public Presentaciones() {
    }

    public Presentaciones(int cantidad, String unidadMedida) {
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }

    public Presentaciones(int cantidad, String unidadMedida, Set<Productos> productoses) {
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.productoses = productoses;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id_presentacion", unique = true, nullable = false)
    public Integer getIdPresentacion() {
        return this.idPresentacion;
    }

    public void setIdPresentacion(Integer idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    @Column(name = "cantidad", nullable = false)
    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Column(name = "unidad_medida", nullable = false, length = 3)
    public String getUnidadMedida() {
        return this.unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "presentaciones")
    public Set<Productos> getProductoses() {
        return this.productoses;
    }

    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }

}
