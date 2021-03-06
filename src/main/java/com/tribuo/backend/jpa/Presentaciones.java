package com.tribuo.backend.jpa;
// Generated Oct 28, 2017 12:35:33 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
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
@Table(name = "presentaciones",
         catalog = "tribuo",
         uniqueConstraints = @UniqueConstraint(columnNames = {"cantidad", "unidad_medida", "empaque"})
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Presentaciones implements java.io.Serializable {

    private Integer idPresentacion;
    private BigDecimal cantidad;
    private String unidadMedida;
    private String empaque;
    private Set<Productos> productoses = new HashSet<Productos>(0);

    public Presentaciones() {
    }

    public Presentaciones(BigDecimal cantidad, String unidadMedida, String empaque) {
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.empaque = empaque;
    }

    public Presentaciones(BigDecimal cantidad, String unidadMedida, String empaque, Set<Productos> productoses) {
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.empaque = empaque;
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

    @Column(name = "cantidad", nullable = false, precision = 10, scale = 3)
    public BigDecimal getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    @Column(name = "unidad_medida", nullable = false, length = 3)
    public String getUnidadMedida() {
        return this.unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @Column(name = "empaque", nullable = false, length = 50)
    public String getEmpaque() {
        return this.empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
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
