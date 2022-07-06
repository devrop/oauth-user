/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ropandi.user.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 0397
 */
@Entity
@Table(name = "trxClientResource")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrxClientResource.findAll", query = "SELECT t FROM TrxClientResource t")
    , @NamedQuery(name = "TrxClientResource.findById", query = "SELECT t FROM TrxClientResource t WHERE t.id = :id")
    , @NamedQuery(name = "TrxClientResource.findByResourceId", query = "SELECT t FROM TrxClientResource t WHERE t.resourceId = :resourceId")
    , @NamedQuery(name = "TrxClientResource.findByResourceIValue", query = "SELECT t FROM TrxClientResource t WHERE t.resourceIValue = :resourceIValue")
    , @NamedQuery(name = "TrxClientResource.findByCreatedAt", query = "SELECT t FROM TrxClientResource t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TrxClientResource.findByCreatedBy", query = "SELECT t FROM TrxClientResource t WHERE t.createdBy = :createdBy")})
public class TrxClientResource implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "resourceId")
    private String resourceId;
    @Basic(optional = false)
    @Column(name = "resourceIValue")
    private String resourceIValue;
    @Basic(optional = false)
    @Column(name = "createdAt")
    private long createdAt;
    @Basic(optional = false)
    @Column(name = "createdBy")
    private String createdBy;
    @JoinColumn(name = "idClient", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MstOauthClient idClient;

    public TrxClientResource() {
    }

    public TrxClientResource(Long id) {
        this.id = id;
    }

    public TrxClientResource(Long id, String resourceId, String resourceIValue, long createdAt, String createdBy) {
        this.id = id;
        this.resourceId = resourceId;
        this.resourceIValue = resourceIValue;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceIValue() {
        return resourceIValue;
    }

    public void setResourceIValue(String resourceIValue) {
        this.resourceIValue = resourceIValue;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public MstOauthClient getIdClient() {
        return idClient;
    }

    public void setIdClient(MstOauthClient idClient) {
        this.idClient = idClient;
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
        if (!(object instanceof TrxClientResource)) {
            return false;
        }
        TrxClientResource other = (TrxClientResource) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TrxClientResource[ id=" + id + " ]";
    }
    
}
