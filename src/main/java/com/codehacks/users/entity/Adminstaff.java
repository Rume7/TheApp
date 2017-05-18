/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codehacks.users.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author use
 */
@Entity
@Table(name = "adminstaff")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adminstaff.findAll", query = "SELECT a FROM Adminstaff a")
    , @NamedQuery(name = "Adminstaff.findById", query = "SELECT a FROM Adminstaff a WHERE a.id = :id")
    , @NamedQuery(name = "Adminstaff.findByAssigncomplain", query = "SELECT a FROM Adminstaff a WHERE a.assigncomplain = :assigncomplain")
    , @NamedQuery(name = "Adminstaff.findByEmail", query = "SELECT a FROM Adminstaff a WHERE a.email = :email")})
public class Adminstaff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "ASSIGNCOMPLAIN")
    private String assigncomplain;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;

    public Adminstaff() {
    }

    public Adminstaff(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssigncomplain() {
        return assigncomplain;
    }

    public void setAssigncomplain(String assigncomplain) {
        this.assigncomplain = assigncomplain;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adminstaff)) {
            return false;
        }
        Adminstaff other = (Adminstaff) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codehacks.users.entity.Adminstaff[ id=" + id + " ]";
    }
    
}
