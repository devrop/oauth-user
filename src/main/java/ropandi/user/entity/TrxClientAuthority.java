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
@Table(name = "trxClientAuthority")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrxClientAuthority.findAll", query = "SELECT t FROM TrxClientAuthority t")
    , @NamedQuery(name = "TrxClientAuthority.findById", query = "SELECT t FROM TrxClientAuthority t WHERE t.id = :id")
    , @NamedQuery(name = "TrxClientAuthority.findByAuthorityCode", query = "SELECT t FROM TrxClientAuthority t WHERE t.authorityCode = :authorityCode")
    , @NamedQuery(name = "TrxClientAuthority.findByAuthorityValue", query = "SELECT t FROM TrxClientAuthority t WHERE t.authorityValue = :authorityValue")
    , @NamedQuery(name = "TrxClientAuthority.findByCreatedAt", query = "SELECT t FROM TrxClientAuthority t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TrxClientAuthority.findByCreatedBy", query = "SELECT t FROM TrxClientAuthority t WHERE t.createdBy = :createdBy")})
public class TrxClientAuthority implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "authorityCode")
    private String authorityCode;
    @Basic(optional = false)
    @Column(name = "authorityValue")
    private String authorityValue;
    @Basic(optional = false)
    @Column(name = "createdAt")
    private long createdAt;
    @Basic(optional = false)
    @Column(name = "createdBy")
    private String createdBy;
    @JoinColumn(name = "idClient", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MstOauthClient idClient;

    public TrxClientAuthority() {
    }

    public TrxClientAuthority(Long id) {
        this.id = id;
    }

    public TrxClientAuthority(Long id, String authorityCode, String authorityValue, long createdAt, String createdBy) {
        this.id = id;
        this.authorityCode = authorityCode;
        this.authorityValue = authorityValue;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(String authorityCode) {
        this.authorityCode = authorityCode;
    }

    public String getAuthorityValue() {
        return authorityValue;
    }

    public void setAuthorityValue(String authorityValue) {
        this.authorityValue = authorityValue;
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
        if (!(object instanceof TrxClientAuthority)) {
            return false;
        }
        TrxClientAuthority other = (TrxClientAuthority) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TrxClientAuthority[ id=" + id + " ]";
    }
    
}
