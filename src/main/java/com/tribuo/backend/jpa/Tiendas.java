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
 * Tiendas generated by hbm2java
 */
@Entity
@Table(name="tiendas"
    ,catalog="tribuo"
    , uniqueConstraints = {@UniqueConstraint(columnNames="cedula"), @UniqueConstraint(columnNames="razon_social")} 
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tiendas  implements java.io.Serializable {


     private Integer idTienda;
     private User user;
     private Integer nit;
     private int cedula;
     private String razonSocial;
     private Set<Sucursales> sucursaleses = new HashSet<Sucursales>(0);

    public Tiendas() {
    }

	
    public Tiendas(User user, int cedula, String razonSocial) {
        this.user = user;
        this.cedula = cedula;
        this.razonSocial = razonSocial;
    }
    public Tiendas(User user, Integer nit, int cedula, String razonSocial, Set<Sucursales> sucursaleses) {
       this.user = user;
       this.nit = nit;
       this.cedula = cedula;
       this.razonSocial = razonSocial;
       this.sucursaleses = sucursaleses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_tienda", unique=true, nullable=false)
    public Integer getIdTienda() {
        return this.idTienda;
    }
    
    public void setIdTienda(Integer idTienda) {
        this.idTienda = idTienda;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="propietario", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="nit")
    public Integer getNit() {
        return this.nit;
    }
    
    public void setNit(Integer nit) {
        this.nit = nit;
    }

    
    @Column(name="cedula", unique=true, nullable=false)
    public int getCedula() {
        return this.cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
    @Column(name="razon_social", unique=true, nullable=false, length=30)
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @JsonIgnore
    @OneToMany(fetch=FetchType.EAGER, mappedBy="tiendas")
    public Set<Sucursales> getSucursaleses() {
        return this.sucursaleses;
    }
    
    public void setSucursaleses(Set<Sucursales> sucursaleses) {
        this.sucursaleses = sucursaleses;
    }




}


