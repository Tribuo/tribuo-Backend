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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name="usuarios"
    ,catalog="tribuo"
    , uniqueConstraints = {@UniqueConstraint(columnNames="usuario"), @UniqueConstraint(columnNames="correo"), @UniqueConstraint(columnNames="numero_contacto")} 
)
public class Usuarios  implements java.io.Serializable {


     private Integer idUsuario;
     private String nombre;
     private String apellidos;
     private String usuario;
     private String password;
     private String correo;
     private int numeroContacto;
     private Set<Tiendas> tiendases = new HashSet<Tiendas>(0);

    public Usuarios() {
    }

	
    public Usuarios(String nombre, String apellidos, String usuario, String password, String correo, int numeroContacto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.password = password;
        this.correo = correo;
        this.numeroContacto = numeroContacto;
    }
    public Usuarios(String nombre, String apellidos, String usuario, String password, String correo, int numeroContacto, Set<Tiendas> tiendases) {
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.usuario = usuario;
       this.password = password;
       this.correo = correo;
       this.numeroContacto = numeroContacto;
       this.tiendases = tiendases;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_usuario", unique=true, nullable=false)
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    @Column(name="nombre", nullable=false, length=20)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="apellidos", nullable=false, length=20)
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    @Column(name="usuario", unique=true, nullable=false, length=15)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="password", nullable=false, length=50)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="correo", unique=true, nullable=false, length=50)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    @Column(name="numero_contacto", unique=true, nullable=false)
    public int getNumeroContacto() {
        return this.numeroContacto;
    }
    
    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuarios")
    public Set<Tiendas> getTiendases() {
        return this.tiendases;
    }
    
    public void setTiendases(Set<Tiendas> tiendases) {
        this.tiendases = tiendases;
    }




}


