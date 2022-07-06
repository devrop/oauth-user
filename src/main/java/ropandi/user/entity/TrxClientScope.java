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
@Table(name = "trxClientScope")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrxClientScope.findAll", query = "SELECT t FROM TrxClientScope t")
    , @NamedQuery(name = "TrxClientScope.findById", query = "SELECT t FROM TrxClientScope t WHERE t.id = :id")
    , @NamedQuery(name = "TrxClientScope.findByScopeCode", query = "SELECT t FROM TrxClientScope t WHERE t.scopeCode = :scopeCode")
    , @NamedQuery(name = "TrxClientScope.findByScopeValue", query = "SELECT t FROM TrxClientScope t WHERE t.scopeValue = :scopeValue")
    , @NamedQuery(name = "TrxClientScope.findByCreatedAt", query = "SELECT t FROM TrxClientScope t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TrxClientScope.findByCreatedBy", query = "SELECT t FROM TrxClientScope t WHERE t.createdBy = :createdBy")})
public class TrxClientScope implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "scopeCode")
    private String scopeCode;
    @Basic(optional = false)
    @Column(name = "scopeValue")
    private String scopeValue;
    @Basic(optional = false)
    @Column(name = "createdAt")
    private long createdAt;
    @Basic(optional = false)
    @Column(name = "createdBy")
    private String createdBy;
    @JoinColumn(name = "idClient", referencedColumnName = "id")
    @ManyToOne
    private MstOauthClient idClient;

    public TrxClientScope() {
    }

    public TrxClientScope(Long id) {
        this.id = id;
    }

    public TrxClientScope(Long id, String scopeCode, String scopeValue, long createdAt, String createdBy) {
        this.id = id;
        this.scopeCode = scopeCode;
        this.scopeValue = scopeValue;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScopeCode() {
        return scopeCode;
    }

    public void setScopeCode(String scopeCode) {
        this.scopeCode = scopeCode;
    }

    public String getScopeValue() {
        return scopeValue;
    }

    public void setScopeValue(String scopeValue) {
        this.scopeValue = scopeValue;
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
        if (!(object instanceof TrxClientScope)) {
            return false;
        }
        TrxClientScope other = (TrxClientScope) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TrxClientScope[ id=" + id + " ]";
    }
    
}
