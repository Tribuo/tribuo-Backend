package com.tribuo.backend.jpa;
// Generated Oct 28, 2017 12:35:33 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Propietarios generated by hbm2java
 */
@Entity
@Table(name = "propietarios",
         catalog = "tribuo",
         uniqueConstraints = @UniqueConstraint(columnNames = "nombre_propietario")
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Propietarios implements java.io.Serializable {

    private int idPropietario;
    private String nombrePropietario;
    private Set<Fabricantes> fabricanteses = new HashSet<Fabricantes>(0);

    public Propietarios() {
    }

    public Propietarios(int idPropietario, String nombrePropietario) {
        this.idPropietario = idPropietario;
        this.nombrePropietario = nombrePropietario;
    }

    public Propietarios(int idPropietario, String nombrePropietario, Set<Fabricantes> fabricanteses) {
        this.idPropietario = idPropietario;
        this.nombrePropietario = nombrePropietario;
        this.fabricanteses = fabricanteses;
    }

    @Id

    @Column(name = "id_propietario", unique = true, nullable = false)
    public int getIdPropietario() {
        return this.idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    @Column(name = "nombre_propietario", unique = true, nullable = false, length = 75)
    public String getNombrePropietario() {
        return this.nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "propietarios_fabricantes", catalog = "tribuo", joinColumns = {
        @JoinColumn(name = "propietario", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "fabricante", nullable = false, updatable = false)})
    public Set<Fabricantes> getFabricanteses() {
        return this.fabricanteses;
    }

    public void setFabricanteses(Set<Fabricantes> fabricanteses) {
        this.fabricanteses = fabricanteses;
    }

}
