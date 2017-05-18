package com.codehacks.users.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author use
 */
@Entity
@Table(name = "complain")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Complain.findAll", query = "SELECT c FROM Complain c")
    , @NamedQuery(name = "Complain.findById", query = "SELECT c FROM Complain c WHERE c.id = :id")
    , @NamedQuery(name = "Complain.findByDateOfCreation", query = "SELECT c FROM Complain c WHERE c.dateOfCreation = :dateOfCreation")
    , @NamedQuery(name = "Complain.findByClientComplain", query = "SELECT c FROM Complain c WHERE c.clientComplain = :clientComplain")
    , @NamedQuery(name = "Complain.findByComplainStatus", query = "SELECT c FROM Complain c WHERE c.complainStatus = :complainStatus")})
public class Complain implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "date_of_creation")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfCreation;
    
    @Size(max = 555)
    @Column(name = "client_complain")
    private String clientComplain;
    
    @Size(max = 55)
    @Column(name = "complain_status")
    private String complainStatus;

    public Complain() {
    }

    public Complain(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getClientComplain() {
        return clientComplain;
    }

    public void setClientComplain(String clientComplain) {
        this.clientComplain = clientComplain;
    }

    public String getComplainStatus() {
        return complainStatus;
    }

    public void setComplainStatus(String complainStatus) {
        this.complainStatus = complainStatus;
    }

}
