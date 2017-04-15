package com.tribuo.backend.jpa;
// Generated Apr 14, 2017 8:01:04 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="tribuo"
    , uniqueConstraints = {@UniqueConstraint(columnNames="contact_number"), @UniqueConstraint(columnNames="email")} 
)
public class User  implements java.io.Serializable {


     private Integer userId;
     private int active;
     private String email;
     private String lastName;
     private String name;
     private String password;
     private int contactNumber;
     private Set<Tiendas> tiendases = new HashSet<Tiendas>(0);
     private Set<Role> roles = new HashSet<Role>(0);

    public User() {
    }

	
    public User(int active, String email, String lastName, String name, String password, int contactNumber) {
        this.active = active;
        this.email = email;
        this.lastName = lastName;
        this.name = name;
        this.password = password;
        this.contactNumber = contactNumber;
    }
    public User(int active, String email, String lastName, String name, String password, int contactNumber, Set<Tiendas> tiendases, Set<Role> roles) {
       this.active = active;
       this.email = email;
       this.lastName = lastName;
       this.name = name;
       this.password = password;
       this.contactNumber = contactNumber;
       this.tiendases = tiendases;
       this.roles = roles;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="user_id", unique=true, nullable=false)
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    @Column(name="active", nullable=false)
    public int getActive() {
        return this.active;
    }
    
    public void setActive(int active) {
        this.active = active;
    }

    
    @Column(name="email", unique=true, nullable=false, length=20)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="last_name", nullable=false, length=20)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="name", nullable=false, length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="contact_number", unique=true, nullable=false)
    public int getContactNumber() {
        return this.contactNumber;
    }
    
    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Tiendas> getTiendases() {
        return this.tiendases;
    }
    
    public void setTiendases(Set<Tiendas> tiendases) {
        this.tiendases = tiendases;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="user_role", catalog="tribuo", joinColumns = { 
        @JoinColumn(name="user_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="role_id", nullable=false, updatable=false) })
    public Set<Role> getRoles() {
        return this.roles;
    }
    
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }




}


